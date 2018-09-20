package com.anwesh.uiprojects.linkedincompletepieview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.incompletepieview.IncompletePieView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IncompletePieView.create(this)
    }
}
