package com.jilence.challenge.challenge

import com.jilence.challenge.utils.PluginType

class Builder(val type: PluginType) {

    fun apply(builder: Challenges.() -> Unit) : Challenges {
        val challenge = Challenges()
        builder(challenge)
        return challenge
    }

}
