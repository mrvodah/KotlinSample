package com.example.kotlinsample.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import com.example.kotlinsample.R
import com.example.kotlinsample.databinding.ActivityTriviaBinding
import kotlinx.android.synthetic.main.activity_trivia.*

class TriviaActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var binding: ActivityTriviaBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_trivia)

        drawerLayout = binding.drawerLayout

        navController = this.findNavController(R.id.my_nav_host)

        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        NavigationUI.setupWithNavController(nav_view, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}
