package com.example.migrationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.dylanc.viewbinding.binding
import com.example.migrationdemo.bean.Task
import com.example.migrationdemo.databinding.ActivityMainBinding
import io.realm.RealmResults
import io.realm.kotlin.executeTransactionAwait
import io.realm.kotlin.where
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private val binding by binding<ActivityMainBinding>()
    private var no = 1
    private val taskAdapter = TaskAdapter()
//    private var tasks: List<Task> = emptyList()
    private val realm by lazy { RealmManager.getInstance() }
    private var results: RealmResults<Task>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            rvDb.apply {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
                adapter = taskAdapter
            }

            btnInsert.setOnClickListener {
                Task().apply {
                    name = "task$no"
                }.also {
                    lifecycleScope.launchWhenResumed {
                        realm.executeTransactionAwait(Dispatchers.IO) { r ->
                            r.insert(it)
                        }
                        realm.executeTransactionAwait(Dispatchers.IO) { r ->
                            results = r.where<Task>().findAll()
                        }
                    }
                }
            }

            btnClear.setOnClickListener {
                lifecycleScope.launchWhenResumed {
                    realm.executeTransactionAwait(Dispatchers.IO) { r ->
                        r.where<Task>().findAll().deleteAllFromRealm()
                    }
                    realm.executeTransactionAwait(Dispatchers.IO) { r ->
                        results = r.where<Task>().findAll()
                    }
                }
            }
        }

        addRealmChangeListener()

//        lifecycleScope.launchWhenResumed {
//            realm.executeTransactionAwait(Dispatchers.IO) { r ->
//                val results = r.where<Task>().findAll()
//                tasks = r.copyFromRealm(results)
//                no = tasks.size + 1
//            }
//            taskAdapter.setList(tasks)
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.removeAllChangeListeners()
        realm.close()
    }

    private fun addRealmChangeListener() {
        results = realm.where<Task>().findAllAsync()

        results!!.addChangeListener { t, changeSet ->
//            tasks = realm.copyFromRealm(t)
            no = t.size + 1
            Log.i(TAG, "realm change ${no - 1}")
            taskAdapter.setList(t)
        }
    }
}