package me.michel.KotlinBase.objects

import org.bukkit.entity.ArmorStand
import org.bukkit.entity.Player

// Hier is zo'n object, je kunt de object-deceleratie zien als een static class waarbij al je methods statics zijn, handig voor Utils of andere extra's in je plugin
// In deze SendObject ga ik een Armorstand versturen, opslaan en removen naar een spelerslocatie.
object SendObject {

    // Arraylist met al mijn onderdanige Armorstands :D
    var stands: ArrayList<ArmorStand> =  ArrayList<ArmorStand>()

    // sendArmorStand, dit vestuurt de ArmorStand naar de speler.
    // Zoals je ziet hoef je niet veel meer gebruik te maken van get en set,
    // dit zijn nu vars geworden.
    fun sendArmorStand(p: Player){
        val stand = p.world.spawn(p.location,ArmorStand::class.java)
        stand.setGravity(false)
        stand.customName = p.name
        stand.isCustomNameVisible = true
        stands.add(stand)
    }

    // Destroy alle armorstands in mijn lijst. Wordt gedaan in Base.kt:onDisable()
    fun destroy(){
        stands.forEach({
            it.remove()
        })
    }
}