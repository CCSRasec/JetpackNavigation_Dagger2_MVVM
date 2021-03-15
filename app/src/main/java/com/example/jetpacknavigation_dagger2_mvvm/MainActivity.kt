package com.example.jetpacknavigation_dagger2_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpacknavigation_dagger2_mvvm.ui.profile.ProfileFragment
import com.example.jetpacknavigation_dagger2_mvvm.ui.start.StartFragment

class MainActivity : AppCompatActivity(), StartFragment.OnButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    supportFragmentManager.beginTransaction()
        .add(R.id.myContainer, StartFragment.newInstance())
        .commit()
    }

    override fun buttonClicked() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.myContainer, ProfileFragment.newInstance())
            .commit()
    }
}