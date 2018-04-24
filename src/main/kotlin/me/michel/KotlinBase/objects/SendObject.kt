package me.michel.KotlinBase.objects

import org.bukkit.ChatColor
import org.bukkit.entity.ArmorStand
import org.bukkit.entity.Player

object SendObject {

    fun send(p: Player, obj: Any){
        if(obj is String || obj is Int || obj is Double || obj is Float){
            p.sendMessage("" + ChatColor.UNDERLINE + "Object:" + ChatColor.RESET + " " + obj)
        }
        if(obj is ArmorStand){
            SendArmorStand.send(p,obj)
        }
    }
}