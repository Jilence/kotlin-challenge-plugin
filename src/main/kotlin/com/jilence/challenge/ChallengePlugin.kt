package com.jilence.challenge

import com.jilence.challenge.manager.Challenge
import com.jilence.challenge.manager.Challenges
import com.jilence.challenge.utils.Scheduler
import net.axay.kspigot.main.KSpigot
import java.util.*


lateinit var main: ChallengePlugin

class ChallengePlugin : KSpigot() {

    override fun startup() {
        main = this
        Scheduler().start()

        Challenges.loadChallenge()
    }

    override fun shutdown() {

    }

}