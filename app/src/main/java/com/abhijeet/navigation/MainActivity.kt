package com.abhijeet.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      navController=findNavControler(R.id.navController)
    }

    private fun findNavControler(navController: Int): NavController {
        TODO("Not yet implemented")
    }
}