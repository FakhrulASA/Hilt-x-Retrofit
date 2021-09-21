package com.fakhrulasa.hiltdiimpl

import javax.inject.Inject

class ConstructionInjectClass
@Inject constructor(){
    fun printSomething(s:String):String{
        return s
    }
}