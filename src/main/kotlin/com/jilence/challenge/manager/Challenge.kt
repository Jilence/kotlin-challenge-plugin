package com.jilence.challenge.manager

abstract interface Challenge  {

    val challenge: Builder

    abstract fun onLoad()
    abstract fun onTick()

}