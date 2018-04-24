package me.michel.KotlinBase

import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin

class Base : JavaPlugin() {

    override fun onEnable() {
        instance = this

        //TODO: Load example objects & listeners.
    }

    override fun onDisable() {
        instance = null
    }

    companion object {
        var instance: Plugin? = null
    }
}