package com.doublek.listmarker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListSelectionRecyclerViewAdapter :
    RecyclerView.Adapter<ListSelectionViewHolder>() {
    val listTitles = arrayOf("Shopping List","Chores","Android Tutorials")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        // 1
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_selection_view_holder,
                parent,
                false)
        // 2
        return ListSelectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }
}