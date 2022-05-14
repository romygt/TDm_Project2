package com.example.tp4_exo1

import java.io.Serializable

data class News(var titleImage : Int, var heading : String,var etat : String, var pourcentage : String, var wilaya : String,var kilometrage : String, var duration : String) :Serializable
