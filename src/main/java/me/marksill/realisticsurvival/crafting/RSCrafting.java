package me.marksill.realisticsurvival.crafting;

import me.marksill.realisticsurvival.item.RSItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RSCrafting {
	
	public static void init() {
		//shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[] {RSItems.branch}); //branch to sticks
		GameRegistry.addShapelessRecipe(new ItemStack(RSItems.flintaxe), new Object[] {RSItems.flintaxehead, RSItems.cord, Items.stick});
		
		//shaped recipes
		GameRegistry.addShapelessRecipe(new ItemStack(RSItems.flintaxehead), "ff", "f ", 'f', new ItemStack(Items.flint));
	}

}
