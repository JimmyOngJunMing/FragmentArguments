package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn_About)

        btn.setOnClickListener(){
            //Internal Activity
//            val aboutIntent = Intent (this, AboutActivity::class.java)


//            startActivity(aboutIntent)

            //External Activity
            //-------------------

            //Phone Call
//            val value = Uri.parse("tel:01234567")
//            val intent = Intent(Intent.ACTION_DIAL, value)
            //startActivity(intent)

            //Show Location
            val geo = Uri.parse("geo: 3.1390, 101.6869")
            val intent = Intent(Intent.ACTION_VIEW, geo)
            startActivity(intent)

            //Send Mail
//            val intent = Intent(Intent.ACTION_SEND)
//            intent.setType("text/plain")
//            intent.putExtra(Intent.EXTRA_TEXT, "Hello")
//
//            try{
//                startActivity(intent)
//            }catch (e: ActivityNotFoundException){
//                Toast.makeText(this, "App Not Found", Toast.LENGTH_LONG).show()
//            }

        }
    }
}