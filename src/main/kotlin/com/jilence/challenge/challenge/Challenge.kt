package com.jilence.challenge.challenge

abstract class Challenge {

    abstract val challengeSettings: ChallengeSettings?
    abstract fun loadChallenge()

}

class Challenges {

    fun build(builder: ChallengeBuilder.() -> Unit = {
        name = "UNNAMED"
    }) {
        builder(ChallengeBuilder())
    }

}

class ChallengeSettings(
    private val challengeName: String
) {

    val name: String = this.challengeName

}

class ChallengeBuilder {

    lateinit var name: String

    fun build() : ChallengeSettings {
        return ChallengeSettings(this.name)
    }

}