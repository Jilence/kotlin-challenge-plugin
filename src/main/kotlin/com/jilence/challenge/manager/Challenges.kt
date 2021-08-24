package com.jilence.challenge.manager

import com.jilence.challenge.challenge.TestChallenge

object Challenges {

    val challenges = ArrayList<Challenge>()

    fun loadChallenge() {
        add(TestChallenge())

        for(challenge in challenges) {
            challenge.onLoad()
        }
    }

    fun add(challenge: Challenge) {
        this.challenges.add(challenge)
    }

    fun remove(challenge: Challenge) {
        this.challenges.remove(challenge)
    }

}