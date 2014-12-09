package me.marksill.realisticsurvival.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Helper {
	
	private static String modid;
	
	public static void registerItemRenderThing(Item item, String texture) {
		registerItemRenderThing(item, 0, texture);
	}
	
	public static void registerItemRenderThing(Item item, int meta, String texture) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + texture, "inventory"));
	}
	
	public static void setModID(String name) {
		modid = name;
	}
	
	public static void print(String msg) {
		System.out.println("[Realistic Survival] " + msg);
	}

}
