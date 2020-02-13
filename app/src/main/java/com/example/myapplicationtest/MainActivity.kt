package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val xVals = mutableListOf<String>()
        xVals.add("Test String 1")
        xVals.add("Test String 2")
        xVals.add("Test String 3")

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        list_view.layoutManager = linearLayoutManager
        list_view.adapter = TripStopsAdapter(this, xVals)

        switch_gone.setOnClickListener {
            when (list_view.visibility) {
                View.GONE -> list_view.visibility = View.VISIBLE
                else -> list_view.visibility = View.GONE
            }
        }
    }
}
