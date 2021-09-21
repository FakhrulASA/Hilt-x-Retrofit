package com.fakhrulasa.hiltdiimpl

import javax.inject.Inject

class FieldInjectionClass
@Inject constructor(private val constructionInjectClass: ConstructionInjectClass){

    fun printDo(s:String):String{
        return s
    }
    fun printWithConInject(s:String):String{
        return  constructionInjectClass.printSomething(s)
    }
}