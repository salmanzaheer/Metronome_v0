package com.example.metronome_v0

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.metronome_v0.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var txtTempo: TextView

    //initial values
    private var bpm = 120
    private var beatsPerMeasure = 4
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //link to xml
        btnAdd = findViewById(R.id.btn_TempoIncrease)
        btnSub = findViewById(R.id.btn_TempoLower)
        txtTempo = findViewById(R.id.txt_tempo)


        txtTempo.text = bpm.toString()

        //increase tempo
        btnAdd.setOnClickListener {
            if (bpm in 21..219) {
                bpm++
            }
            txtTempo.text = bpm.toString()
        }

        btnSub.setOnClickListener {
            if (bpm in 21..219) {
                bpm--
            }
            txtTempo.text = bpm.toString()
        }

    }
/*
    private fun addTempo() {
        if (bpm in 21..219) {
            bpm += 1
        }
    }

    private fun subTempo() {
        if (bpm in 21..219) {
            bpm -= 1
        }
    } */
}