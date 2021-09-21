package com.fakhrulasa.hiltdiimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //field Injection
    @Inject
    lateinit var printClass:PrintClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,printClass.printDo("Lets print"),Toast.LENGTH_LONG).show()


    }
}