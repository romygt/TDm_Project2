package com.example.tp4_exo1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.edit
import com.google.android.material.bottomnavigation.BottomNavigationView

class ReservationActivity : AppCompatActivity() {


    private lateinit var logout: Button
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)
        logout = findViewById(R.id.logout)


        val pref = getSharedPreferences("fileName", Context.MODE_PRIVATE)
        val cat = pref.getString("user", "nul")
        val mail = pref.getString("email", "nul")
        var numText = findViewById(R.id.ReservationtextView) as TextView
        if((cat != "test")||(mail != "test@gmail.com")){
       // numText.text = cat
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            pref.edit {
                putString("user", "nul")
            }

            val cat = pref.getString("user", "nul")
            numText.text = cat
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }




        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnNavigationItemSelectedListener{
            val b: Boolean = when (it.itemId) {
                /*  R.id.ic_parkinglist -> { val intent = Intent(this,MainActivity2::class.java)
                      startActivity(intent)}
                  R.id.ic_parkinglist -> {true}*/

                else -> {true }
            }
            if(it.itemId ==   R.id.ic_parkinglist ){
                // replaceFragment(parkingfragment)
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)}
            if(it.itemId ==   R.id.ic_reservation ){
                // replaceFragment(parkingfragment)

                val intent = Intent(this,ReservationActivity::class.java)
                startActivity(intent)}
            true
        }
    }
}