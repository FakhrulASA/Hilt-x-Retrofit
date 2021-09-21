package com.fakhrulasa.hiltdiimpl

import javax.inject.Inject

class PrintClass
@Inject constructor(){
    fun printDo(s:String):String{
        return s
    }
}