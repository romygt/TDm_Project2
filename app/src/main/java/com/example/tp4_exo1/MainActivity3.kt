package com.example.tp4_exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tp4_exo1.fragments.Parking_listFragment
import com.example.tp4_exo1.fragments.ReservationFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {

    private val parkingfragment = Parking_listFragment()
    private val reservationfragment = ReservationFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
       // replaceFragment()
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

    private fun replaceFragment(fragment: Fragment) {
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }

    }
}