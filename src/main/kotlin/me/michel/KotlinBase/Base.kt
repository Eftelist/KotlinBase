package me.michel.KotlinBase

import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin

// Dit is mijn basis, dit is de eerste class die wordt geladen via de plugin.yml in resources.
// Base : JavaPlugin() { wordt in Java ook wel neergezet als `public class Base extends JavaPlugin(){`

// In Kotlin ziet er veel anders uit, er hoeft bijvoorbeeld geen ; meer achter al je zinnentjes, mocht je het toch perongeluk
// hebben gedaan bij een class kun je op de ; gaan staan met je muis en dan CTRL+SPACE, en dan cleanup Code.
// Dat maakt je code vrij van overige dingentjes die niet nodig zijn.
class Base : JavaPlugin() {

    // De override in Kotlin is anders als in Java, maar wordt meer gezien als een functie en niet als
    // een annotatie. In deze onEnable laad ik mijn objects en instance (Zodat ik hier later bij kan).
    override fun onEnable() {
        instance = this

        // Deze `TODO`
        // beschrijft wat ik nog wil gaan maken, Dit is erg handig als je bijv InteliJ IDEA gebruikt, hij zal bij
        // het commiten naar Github / Gitlab aan mij laten zien of ik hier nog iets wil doen.
        //TODO: Load example objects & listeners.
    }

    // In deze onDisable laad ik mijn instance uit en kan ik eventueel nog wachten totdat alles uitstaat. (Objects)
    override fun onDisable() {
        instance = null
    }

    // Dit is mijn statische object, vanuit hier kan ik in bijvoorbeeld in een andere class Base.instance doen.
    // Dit gebruik ik vaak voor het laden van modules en runnables. (Hier komen we later op terug)
    companion object {
        // Wat is dit? Dit is een var, een var staat voor alle dingen die gewijzigd mogen worden door andere functies.
        // Je kunt ook eventueel een val gebruiken, die mag maar 1 keer worden geinstalleerd.
        // In Java zet je hier bijvoorbeeld `public / private (final) Plugin plugin = null; neer, in Kotlin gaat het net ietsjes handiger
        // hier hoeft bijvoorbeeld alleen dit:
        var instance: Plugin? = null
        // De var voor de variable, de naam, :, het type (hoeft niet) en de init.
    }
}