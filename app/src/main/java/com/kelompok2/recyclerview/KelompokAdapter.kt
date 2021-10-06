package com.kelompok2.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KelompokAdapter(private val context: Context, private val kelompok: List<Kelompok>, val listener: (Kelompok) -> Unit)
    : RecyclerView.Adapter<KelompokAdapter.KelompokViewHolder>(){

    class KelompokViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgKelompok = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKelompok = view.findViewById<TextView>(R.id.tv_item_name)
        val descKelompok = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(kelompok: Kelompok, listener: (Kelompok) -> Unit){
            imgKelompok.setImageResource(kelompok.imgKelompok)
            nameKelompok.text = kelompok.nameKelompok
            descKelompok.text = kelompok.descKelompok
            itemView.setOnClickListener {
                listener(kelompok)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelompokViewHolder {
        return KelompokViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kelompok, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KelompokViewHolder, position: Int) {
        holder.bindView(kelompok[position], listener)
    }

    override fun getItemCount(): Int = kelompok.size
}