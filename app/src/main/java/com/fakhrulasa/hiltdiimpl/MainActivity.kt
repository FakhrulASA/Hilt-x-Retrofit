package com.fakhrulasa.hiltdiimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var textShow:TextView

    //field Injection
    @Inject
    lateinit var fieldInjectionClass:FieldInjectionClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textShow=findViewById(R.id.mainText)

        Handler().postDelayed({
            textShow.text=fieldInjectionClass.printDo("Field Injected")
        }, 1000)

        Handler().postDelayed({
            textShow.text=fieldInjectionClass.printWithConInject("Construction Injected")
        }, 2000)
        Handler().postDelayed({
            textShow.text=fieldInjectionClass.printWithProvide("Dependencies Provided")
        }, 3000)
    }
}