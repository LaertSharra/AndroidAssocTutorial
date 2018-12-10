package com.example.simvelop_2.androidtrainingassociate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        show_count?.text = 0.toString()
    }

    fun btnShowToast_Click(view: View){
        Toast.makeText(this, getString(R.string.toast_message),Toast.LENGTH_SHORT).show()
    }

    private var mCount = 0

    fun btnCountUp_Click(view: View){
        mCount++
        show_count.text = mCount.toString()
    }




}
