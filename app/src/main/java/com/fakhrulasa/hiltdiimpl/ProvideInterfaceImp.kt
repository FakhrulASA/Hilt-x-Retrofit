package com.fakhrulasa.hiltdiimpl

import javax.inject.Inject

class ProvideInterfaceImp
@Inject constructor():ProvideInterface{
    override fun provideName(s: String): String {
        return s
    }
    override fun provideAge(s: String): String {
        return s
    }
}