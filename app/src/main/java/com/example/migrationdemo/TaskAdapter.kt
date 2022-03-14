package com.example.migrationdemo

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dylanc.viewbinding.getBinding
import com.example.migrationdemo.bean.Task
import com.example.migrationdemo.databinding.ItemTaskBinding

/**
 * @author hejiadong
 * @date 2022/3/9
 * @description
 */
class TaskAdapter : BaseQuickAdapter<Task, BaseViewHolder>(R.layout.item_task) {

    override fun convert(holder: BaseViewHolder, item: Task) {
        holder.getBinding<ItemTaskBinding>().apply {
            tvName.text = item.name
        }
    }
}