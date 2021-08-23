package com.jilence.challenge.utils

import org.bukkit.ChatColor

enum class PluginType(val prefix: String, val id: Int) {

    DEVELOPMENT("${ChatColor.RED}${ChatColor.BOLD}Development", 2),
    ULTIMATE("${ChatColor.DARK_PURPLE}ULTIMATE", 1),
    NORMAL("${ChatColor.GRAY}NORMAL", 0)

}