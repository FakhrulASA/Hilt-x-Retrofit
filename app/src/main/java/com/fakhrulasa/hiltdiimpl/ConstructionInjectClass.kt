package com.fakhrulasa.hiltdiimpl

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConstructionInjectClass
@Inject constructor(private var provideInterface: ProvideInterfaceImp){
    fun printSomething(s:String):String{
        return s
    }
    fun printSomethingProvides(s:String):String{
        return provideInterface.provideName(s)
    }
}