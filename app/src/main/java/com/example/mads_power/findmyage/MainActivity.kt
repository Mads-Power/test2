package com.example.mads_power.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.attribute.AclFileAttributeView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* buFindAge.setOnClickListener{
            //fire when

        }*/

    }
    fun buFindAgeEvent(view: View){
        val yearOfBirth:Int = txtYearOfBirth.text.toString().toInt()
        if (yearOfBirth ==0){
            tvShowAge.text="Invalid input!"
            return
        }
        
        var curretYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = curretYear - yearOfBirth
        tvShowAge.text = "your age is $myAge years"
    }
}
