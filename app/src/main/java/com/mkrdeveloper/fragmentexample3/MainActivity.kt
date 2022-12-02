package com.mkrdeveloper.fragmentexample3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), MyInterface {

    lateinit var txt1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()

        txt1 = findViewById(R.id.txt1)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, firstFragment)
                .addToBackStack("firstFragment")
                .commit()
        }




       /* val intent = intent

        val stringTxt = intent.getStringExtra("xx")

        txt1.text = stringTxt

        */


    }

    override fun transferredMessage(msg: String) {
        txt1.text = msg
    }


}