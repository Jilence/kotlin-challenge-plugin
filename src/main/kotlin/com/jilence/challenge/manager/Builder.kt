package com.jilence.challenge.manager

class Builder(private val challengeName: String, private val challengeNameSpace: String, private val challengeType: ChallengeType, private val challenge: Challenge) {

    fun build() = Challenges.add(challenge)

    val name = challengeName
    val nameSpace = challengeNameSpace

    val type = challengeType

}