package me.marksill.realisticsurvival.item;

import me.marksill.realisticsurvival.RealisticSurvival;
import me.marksill.realisticsurvival.util.Helper;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasePickaxe extends ItemPickaxe {
	
	public String texture;
	
	public BasePickaxe(String name, ToolMaterial material) {
		this(name, name, material);
	}
	
	public BasePickaxe(String name, String texture, ToolMaterial material) {
		super(material);
		this.texture = texture;
		this.setUnlocalizedName(name);
		this.setCreativeTab(RealisticSurvival.tab1);
		GameRegistry.registerItem(this, name);
		RSItems.items.add(this);
	}

}
