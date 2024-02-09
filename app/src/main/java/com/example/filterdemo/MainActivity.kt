package com.example.filterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filters = JsonHelper().filterJsonArray

        filters.forEach {
           it.options.forEach {
               Log.e("ABC", it.toString())
               Log.d("ABC", "\n")
               Log.d("ABC", "\n")
           }
        }
        

    }
}