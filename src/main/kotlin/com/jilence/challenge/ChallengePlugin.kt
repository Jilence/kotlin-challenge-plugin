package com.jilence.challenge

import com.jilence.challenge.challenge.Builder
import com.jilence.challenge.challenges.noBlockBreak
import com.jilence.challenge.utils.PluginType
import net.axay.kspigot.main.KSpigot

lateinit var plugin: Builder

class ChallengePlugin : KSpigot() {

    override fun startup() {

        plugin = Builder(PluginType.DEVELOPMENT)

        plugin.apply {
            noBlockBreak()
        }

    }

    override fun shutdown() {

    }

}