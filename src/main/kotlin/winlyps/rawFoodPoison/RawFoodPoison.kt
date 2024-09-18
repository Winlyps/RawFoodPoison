package winlyps.rawFoodPoison

import org.bukkit.plugin.java.JavaPlugin

class RawFoodPoison : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(RawFoodListener(this), this)
        logger.info("RawFoodPoison plugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("RawFoodPoison plugin has been disabled!")
    }
}