package com.example.kaukaukau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kaukaukau.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val navController = binding.frgNav.getFragment<NavHostFragment>().navController
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.timetableFragment, R.id.transportationFragment, R.id.calendarFragment,
                R.id.menuFragment, R.id.loginFragment)
        ) //Top Fragment를 설정하여 뒤로가기 버튼 비활성화
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.bottomNav.setupWithNavController(navController)

        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = binding.frgNav.getFragment<NavHostFragment>().navController
        return navController.navigateUp() || super.onSupportNavigateUp()
    } //back button
}