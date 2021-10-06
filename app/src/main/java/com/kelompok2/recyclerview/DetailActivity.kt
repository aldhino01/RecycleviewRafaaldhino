package com.kelompok2.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val kelompok = intent.getParcelableExtra<Kelompok>(MainActivity.INTENT_PARCELAB)

        val imgKelompok = findViewById<ImageView>(R.id.img_item_photo)
        val nameKelompok = findViewById<TextView>(R.id.tv_item_name)
        val descKelompok = findViewById<TextView>(R.id.tv_item_description)

        imgKelompok.setImageResource(kelompok?.imgKelompok!!)
        nameKelompok.text = kelompok.nameKelompok
        descKelompok.text = kelompok.descKelompok


    }
}