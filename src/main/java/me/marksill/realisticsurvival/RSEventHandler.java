package me.marksill.realisticsurvival;

import java.util.Random;

import me.marksill.realisticsurvival.item.RSItems;
import me.marksill.realisticsurvival.util.Helper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RSEventHandler {
	
	@SubscribeEvent
	public void onDrops(BlockEvent.HarvestDropsEvent event) {
		Random rand = new Random();
		rand.setSeed(System.nanoTime());
		if (event.state.getBlock() == Blocks.leaves || event.state.getBlock() == Blocks.leaves2) {
			int i = rand.nextInt(3);
			if (i == 0) {
				event.drops.add(new ItemStack(RSItems.branch));
			}
		} else if (event.state.getBlock() == Blocks.tallgrass) {
			int i = rand.nextInt(10);
			if (i == 0) {
				event.drops.add(new ItemStack(RSItems.cord));
			}
		}
	}

}
