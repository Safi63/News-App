package com.example.api_integration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.api_integration.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)


        val surahsObject = mutableListOf<Surah>()

        surahsObject.add(Surah(title ="Al-Feel", description = "Makki | 5 verses" ))
        surahsObject.add(Surah(title ="Quraish", description = "Makki | 4 verses" ))
        surahsObject.add(Surah(title ="Al-Maaun", description = "Makki | 7 verses" ))
        surahsObject.add(Surah(title ="Al-kauthar", description = "Makki | 3 verses" ))
        surahsObject.add(Surah(title ="Al-Kafiroon", description = "Makki | 7 verses" ))
        surahsObject.add(Surah(title ="Al-Nasr", description = "Makki | 3 verses" ))
        surahsObject.add(Surah(title ="Al-Lahab", description = "Makki | 5 verses" ))
        surahsObject.add(Surah(title ="Al-Ikhlas", description = "Makki | 4 verses" ))
        surahsObject.add(Surah(title ="Al-Falaq", description = "Makki | 5 verses" ))
        surahsObject.add(Surah(title ="Al-Naas", description = "Makki | 6 verses" ))
        surahsObject.add(Surah(title ="Quraish", description = "Makki | 4 verses" ))
        surahsObject.add(Surah(title ="Al-Maaun", description = "Makki | 7 verses" ))
        surahsObject.add(Surah(title ="Al-kauthar", description = "Makki | 3 verses" ))
        surahsObject.add(Surah(title ="Al-Kafiroon", description = "Makki | 7 verses" ))
        surahsObject.add(Surah(title ="Al-Nasr", description = "Makki | 3 verses" ))
        surahsObject.add(Surah(title ="Al-Lahab", description = "Makki | 5 verses" ))
        surahsObject.add(Surah(title ="Al-Ikhlas", description = "Makki | 4 verses" ))
        surahsObject.add(Surah(title ="Al-Falaq", description = "Makki | 5 verses" ))
        surahsObject.add(Surah(title ="Al-Naas", description = "Makki | 6 verses" ))


//        val surahs = listOf<String>(
//            "Al-Feel",
//            "Quraish",
//            "Al-Maaun",
//            "Al-kauthar",
//            "Al-Kafiroon",
//            "An-Nasr",
//            "Al-Lahab",
//            "Al-Ikhlas",
//            "Al-Falaq",
//            "An-Naas"
//        )
        val surahList = findViewById<RecyclerView>(R.id.surahList)

        surahList.adapter = MyAdapter(surahsObject)
        surahList.layoutManager = LinearLayoutManager(this)

    }
}