package me.marksill.realisticsurvival;

import me.marksill.realisticsurvival.crafting.RSCrafting;
import me.marksill.realisticsurvival.item.RSItems;
import me.marksill.realisticsurvival.util.Helper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RealisticSurvival.MODID, name = RealisticSurvival.NAME, version = RealisticSurvival.VERSION)
public class RealisticSurvival
{
    public static final String MODID = "realisticsurvival";
    public static final String VERSION = "Alpha F1.0";
    public static final String NAME = "Realistic Survival";
    
    @Instance(value = MODID)
    public static RealisticSurvival instance;
    
    @SidedProxy(clientSide = "me.marksill.realisticsurvival.client.ClientProxy", serverSide = "me.marksill.realisticsurvival.CommonProxy")
    public static CommonProxy proxy;
    
    public static final Item.ToolMaterial MATERIALFLINT = EnumHelper.addToolMaterial("FLINT", 0, 11, 0.5f, 1f, 0);
    
    public static CreativeTabs tab1;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	Helper.setModID("realisticsurvival");
    	tab1 = new CreativeTabs("tab1") {
        	@Override
        	public Item getTabIconItem() {
        		return Item.getItemFromBlock(Blocks.stone);
        	}
        };
    	RSItems.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new RSEventHandler());
    	RSItems.init();
    	RSCrafting.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
