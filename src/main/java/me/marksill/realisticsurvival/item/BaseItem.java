package me.marksill.realisticsurvival.item;

import me.marksill.realisticsurvival.RealisticSurvival;
import me.marksill.realisticsurvival.util.Helper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BaseItem extends Item {
	
	public String texture;
	
	public BaseItem(String name) {
		this(name, name);
	}
	
	public BaseItem(String name, String texture) {
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(RealisticSurvival.tab1);
		GameRegistry.registerItem(this, name);
		RSItems.items.add(this);
	}

}
