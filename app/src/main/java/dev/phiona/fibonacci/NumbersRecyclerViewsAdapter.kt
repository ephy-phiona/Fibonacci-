package dev.phiona.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewsAdapter(var numberList: List<Int>):RecyclerView.Adapter<NumbersRecyclerViewsAdapter.NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return NumbersViewHolder(itemView)
        
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumbers.text= numberList.get(position).toString()
        
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
    class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
    }
}