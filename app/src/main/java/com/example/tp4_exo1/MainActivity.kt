package com.example.tp4_exo1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {

    var mail: EditText? = null
    var mdp: EditText? = null
    private lateinit var validerButton: Button
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        validerButton = findViewById(R.id.button)
        registerButton = findViewById(R.id.button_register)
         mail= findViewById(R.id.editTextTextEmailAddress)
         mdp= findViewById(R.id.editTextTextPassword2)

        var numText = findViewById(R.id.textView) as TextView
     /*   if (mail?.text.toString() != null) {

            var char :String = mail.toString()
            char =  mail?.text.toString()
            numText.text = char
        }
        else{ numText.text = "char"}*/



        validerButton.setOnClickListener {
            var char :String =  mail?.text.toString()
            var char2 :String =  mdp?.text.toString()
            val pref = getSharedPreferences("fileName", Context.MODE_PRIVATE)
           if((char2 == "test")&&(char == "test@gmail.com"))
            //if(char == "test@gmail.com")
            { //numText.text = char

                pref.edit {
                     putString("user", "test")
                    putString("email", "test@gmail.com")
                }
                val intent = Intent(this,ReservationActivity::class.java)
                startActivity(intent)
            }
            else{
            pref.edit {
                putString("user", "n")
                putString("email","char")

            }
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)}

        }

       registerButton.setOnClickListener {
           val intent = Intent(this,RegistrationActivity::class.java)
           startActivity(intent)

        }


    }
}