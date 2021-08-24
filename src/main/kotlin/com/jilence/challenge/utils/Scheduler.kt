package com.jilence.challenge.utils

import com.jilence.challenge.ChallengePlugin
import com.jilence.challenge.main
import com.jilence.challenge.manager.Challenges
import org.bukkit.Bukkit
import org.bukkit.scheduler.BukkitScheduler
import org.bukkit.scheduler.BukkitTask

class Scheduler {

    var scheduler: BukkitTask? = null

    fun start() {
        scheduler = Bukkit.getScheduler().runTaskTimer(main, Runnable {
            Challenges.challenges.forEach {
                it.onTick()
            }
        }, 0, 20)
    }

    fun stop() = scheduler?.cancel()

}