package com.example.tp4_exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var pourcentage : Array<String>
    lateinit var kilometrage : Array<String>
    lateinit var duration : Array<String>
    lateinit var wilaya : Array<String>
    lateinit var state : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageId = arrayOf(R.drawable.istanbul,R.drawable.istanbul)
        heading = arrayOf("R.drawable.istanbul","R.drawable.istanbul")
        state = arrayOf("fermé","ouvert")
        pourcentage = arrayOf("85%","95%")
        kilometrage = arrayOf("255km","265km")
        duration = arrayOf("15min","125min")
        wilaya = arrayOf("Alger","Blida")
        newRecyclerView = findViewById(R.id.recylclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()

  /*   var bottomNavigationView :   BottomNavigationView  = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setSelectedItemId(R.id.ic_parkinglist)
        navigationItemSelected(BottomNavigationView.OnNavigationItemSelectedListener() {

        }*/
        /*val bottomNavigationView = findViewById<BottomNavigationView
                >(R.id.bottom_navigation)*/
       /* val navController = findNavController(R.id.nav_fragment)
        bottomNavigationView.setupWithNavController(navController
        )*/

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

    private fun getUserdata(){
        for(i in 0.. imageId.size-1){
            val news = News (imageId[i], heading[i],state[i],pourcentage[i],wilaya[i], kilometrage[i],duration[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter= Myadapter(newArrayList)
    }

   /* fun navigationItemSelected( item:MenuItem) {
        switch(item.getItemId())
        {
            case R.id.dashboard:
            startActivity(new Intent(getApplicationContext(),DashBoard.class));
            overridePendingTransition(0,0);
            return true;
            case R.id.home:
            return true;
            case R.id.about:
            startActivity(new Intent(getApplicationContext(),About.class));
            overridePendingTransition(0,0);
            return true;
        }
    }*/
    }
