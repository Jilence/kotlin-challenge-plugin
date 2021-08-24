package com.jilence.challenge.manager

object Challenges {

    val challenges = ArrayList<Challenge>()

    fun add(challenge: Challenge) {
        this.challenges.add(challenge)
    }

    fun remove(challenge: Challenge) {
        this.challenges.remove(challenge)
    }

}