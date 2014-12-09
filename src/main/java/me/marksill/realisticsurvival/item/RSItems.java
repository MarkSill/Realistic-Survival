package me.marksill.realisticsurvival.item;

import java.util.ArrayList;

import me.marksill.realisticsurvival.RealisticSurvival;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RSItems {
	
	public static ArrayList<Item> items = new ArrayList<Item>();
	
	public static Item cord, branch, flintaxehead;
	public static ItemPickaxe rockpick;
	public static ItemAxe flintaxe;
	public static ItemSword flintknife;
	
	public static void preInit() {
		cord = new BaseItem("cord");
		rockpick = new BasePickaxe("rocktool", RealisticSurvival.MATERIALFLINT);
		flintaxehead = new BaseItem("flintaxehead");
		flintaxe = new BaseAxe("flintaxe", RealisticSurvival.MATERIALFLINT);
		flintknife = new BaseSword("flintknife", RealisticSurvival.MATERIALFLINT);
		branch = new BaseItem("branch");
	}
	
	public static void init() {
		ItemModelMesher m = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		for (int i = 0; i < items.size(); i++) {
			m.register(items.get(i), 0, new ModelResourceLocation(RealisticSurvival.MODID + ":" + items.get(i).getUnlocalizedName().substring(5), "inventory"));
		}
	}

}
