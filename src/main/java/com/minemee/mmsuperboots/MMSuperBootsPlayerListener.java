package com.minemee.mmsuperboots;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MMSuperBootsPlayerListener implements Listener {
        @EventHandler
        public void onPlayerMove(PlayerMoveEvent event){

        	
    		Player player = event.getPlayer();
    		Block block = player.getLocation().getBlock().getRelative(BlockFace.DOWN);
    		if(block.isLiquid() && (!block.isEmpty())) {
    			player.setVelocity(player.getLocation().getDirection().multiply(.5));
    			block.setType(Material.ICE);
    		}

        }
 
}