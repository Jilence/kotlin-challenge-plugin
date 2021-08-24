package com.jilence.challenge.challenge

import com.jilence.challenge.manager.Builder
import com.jilence.challenge.manager.Challenge
import com.jilence.challenge.manager.ChallengeType

class TestChallenge : Challenge {

    override val challenge: Builder
        get() = Builder("Test Challenge", "test_challenge", ChallengeType.DEVELOPER)

    override fun onLoad() {
        println("load")
    }

    override fun onTick() {
        println("challenge tick")
    }


}