package com.jilence.challenge.challenges

import com.jilence.challenge.challenge.Challenge
import com.jilence.challenge.challenge.ChallengeSettings
import com.jilence.challenge.challenge.Challenges
import org.bukkit.entity.Player

fun Challenges.noBlockBreak() {
    build {
        name = "No Block Break Challenge"
        NoBlockBreak(build()).loadChallenge()
    }
}

class NoBlockBreak(override val challengeSettings: ChallengeSettings?) : Challenge() {

    lateinit var challenge: ChallengeSettings

    override fun loadChallenge() {
        challenge = challengeSettings!!
        println(challenge.name)
    }


}