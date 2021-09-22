package com.fakhrulasa.hiltdiimpl

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityRetainedScoped
class FieldInjectionClass
@Inject constructor(private val constructionInjectClass: ConstructionInjectClass){

    fun printDo(s:String):String{
        return s
    }
    fun printWithConInject(s:String):String{
        return  constructionInjectClass.printSomething(s)
    }
}