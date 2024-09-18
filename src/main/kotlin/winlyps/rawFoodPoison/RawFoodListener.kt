package winlyps.rawFoodPoison

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerItemConsumeEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class RawFoodListener(private val plugin: RawFoodPoison) : Listener {

    @EventHandler
    fun onPlayerConsume(event: PlayerItemConsumeEvent) {
        val item = event.item
        if (isRawFood(item.type)) {
            val player = event.player
            player.addPotionEffect(PotionEffect(PotionEffectType.POISON, 100, 0))
        }
    }

    private fun isRawFood(material: Material): Boolean {
        return when (material) {
            Material.BEEF, Material.CHICKEN, Material.PORKCHOP, Material.MUTTON, Material.RABBIT, Material.ROTTEN_FLESH,
            Material.COD, Material.SALMON, Material.TROPICAL_FISH -> true
            else -> false
        }
    }
}