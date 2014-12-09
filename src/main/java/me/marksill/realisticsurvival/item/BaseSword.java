package me.marksill.realisticsurvival.item;

import me.marksill.realisticsurvival.RealisticSurvival;
import me.marksill.realisticsurvival.util.Helper;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BaseSword extends ItemSword {
	
	public String texture;
	
	public BaseSword(String name, ToolMaterial material) {
		this(name, name, material);
	}
	
	public BaseSword(String name, String texture, ToolMaterial material) {
		super(material);
		this.texture = texture;
		this.setUnlocalizedName(name);
		this.setCreativeTab(RealisticSurvival.tab1);
		GameRegistry.registerItem(this, name);
		RSItems.items.add(this);
	}

}
