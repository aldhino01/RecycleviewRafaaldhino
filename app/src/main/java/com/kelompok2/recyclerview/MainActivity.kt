package com.kelompok2.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELAB = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)

        val kelompokList = listOf<Kelompok>(
            Kelompok(
                R.drawable.faza,
                nameKelompok = "Faza Bilwildi Emyu",
                descKelompok = "Kelahiran Brebes 03/04/2006"
            ),
            Kelompok(
                R.drawable.aldhin,
                nameKelompok = "Rafa Aldhino Fatin",
                descKelompok = "Kelahiran Rumah sakit Unknown"
            ),
            Kelompok(
                R.drawable.athar,
                nameKelompok = "Athar Asif Nurcahyadi",
                descKelompok = "Kelahiran Unknown"
            ),
            Kelompok(
                R.drawable.tanjung,
                nameKelompok = "Mohamad Aprilian Tanjung",
                descKelompok = "Kelahiran unknown"
        ),
            Kelompok(
                R.drawable.faza,
                nameKelompok = "Faza Bilwildi Emyu",
                descKelompok = "Kelahiran Brebes 03/04/2006"
            ),
            Kelompok(
                R.drawable.aldhin,
                nameKelompok = "Rafa Aldhino Fatin",
                descKelompok = "Kelahiran Rumah sakit Unknown"
            ),
            Kelompok(
                R.drawable.athar,
                nameKelompok = "Athar Asif Nurcahyadi",
                descKelompok = "Kelahiran Unknown"
            ),
            Kelompok(
                R.drawable.tanjung,
                nameKelompok = "Mohamad Aprilian Tanjung",
                descKelompok = "Kelahiran unknown"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.kk2_kelompok)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KelompokAdapter(this, kelompokList){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELAB, it)
            startActivity(intent)
        }
    }
}