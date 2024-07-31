package com.soprogramacao.listcontats.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.soprogramacao.listcontats.R
import com.soprogramacao.listcontats.util.FormatterRGB

class MainAdapter(val list:List<String>): RecyclerView.Adapter<MainAdapter.Holder>() {


    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(str:String){

            val img = itemView.findViewById<ImageView>(R.id.item_view_contats_img);
            val txtName = itemView.findViewById<TextView>(R.id.item_view_contats_txtName);
            val txtLetter = itemView.findViewById<TextView>(R.id.item_view_contats_txtLetter);

            img.setBackgroundColor(FormatterRGB.formaterRGB())
            txtName.setText(str)

            txtLetter.setText(str[0].toUpperCase().toString())




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_contats, parent, false))
    }

    override fun getItemCount(): Int {
        return 10;
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list.get(position))
    }


}