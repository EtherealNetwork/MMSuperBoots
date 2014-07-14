package com.minemee.mmsuperboots;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MMSuperBoots extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");

	private final MMSuperBootsPlayerListener playerListener = new MMSuperBootsPlayerListener();

	public void onEnable(){
		log.info("MMSuperBoots enabled!");

		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(playerListener, this);
	}

	public void onDisable(){
		log.info("MMSuperBoots disabled.");
	}

}
