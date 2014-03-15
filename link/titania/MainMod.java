package link.titania;

import net.minecraft.block.material.Material;
import net.minecraft.block.*;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = MainMod.modid, name = "Titania's Armor", version = "Alpha 0.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MainMod 
{
	
	public static final String modid = "titania";
			
	int itemIDs[] = new int[50];
	public static Item titaniaChest, titaniaSkirt, titaniaBoots;
	public static Item heavenHead, heavenChest, heavenSkirt, heavenBoots;
	public static Item blackwingChest, blackwingLegs, blackwingBoots;
	public static Item flightEars, flightPlate, flightLeggings, flightBoots;
	public static Item purgatoryHead, purgatoryChest, purgatoryLegs, purgatoryBoots;
	public static Item adamantineHelm, adamantineChest, adamantineLegs, adamantineBoots;
	public static Item seaHelm, seaChest, seaSkirt, seaBoots;
	public static Item flameHelm, flameChest, flameLegs, flameBoots;
	public static Item giantHelm, giantChest, giantLegs, giantBoots;
	public static Item fairyHead, fairyChest, fairyLegs, fairyBoots;
	
	static EnumArmorMaterial titania = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial heaven = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial blackwing = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial flight = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial purgatory = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial adamantine = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial sea = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial flame = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial giant = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial fairy = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	
			@EventHandler
			public void preInit(FMLPreInitializationEvent event)
			{
				Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		        config.load();
		        
		        itemIDs[0] = config.get("Item", "Titania Chest", 2000).getInt() - 256;
		        itemIDs[1] = config.get("Item", "Titania Skirt", 2001).getInt() - 256;
		        itemIDs[2] = config.get("Item", "Titania Boots", 2002).getInt() - 256;
		        itemIDs[3] = config.get("Item", "Titania Sword", 2004).getInt() - 256;
		        itemIDs[4] = config.get("Item", "Heaven's Wheel Headpiece", 2005).getInt() - 256;
		        itemIDs[5] = config.get("Item", "Heaven's Wheel Chestplate", 2006).getInt() - 256;
		        itemIDs[6] = config.get("Item", "Heaven's Wheel Skirt", 2007).getInt() - 256;
		        itemIDs[7] = config.get("Item", "Heaven's Wheel Boots", 2008).getInt() - 256;
		        itemIDs[8] = config.get("Item", "Blackwing Chest", 2009).getInt() - 256;
		        itemIDs[9] = config.get("Item", "Blackwing Leggings", 2010).getInt() - 256;
		        itemIDs[10] = config.get("Item", "Blackwing Boots", 2011).getInt() - 256;
		        itemIDs[11] = config.get("Item", "Flight Ears", 2012).getInt() - 256;
		        itemIDs[12] = config.get("Item", "Flight Chestplate", 2013).getInt() - 256;
		        itemIDs[13] = config.get("Item", "Flight Leggings", 2014).getInt() - 256;
		        itemIDs[14] = config.get("Item", "Flight Boots", 2015).getInt() - 256;
		        itemIDs[15] = config.get("Item", "Purgatory Head", 2016).getInt() - 256;
		        itemIDs[16] = config.get("Item", "Purgatory Chestplate", 2017).getInt() - 256;
		        itemIDs[17] = config.get("Item", "Purgatory Legs", 2018).getInt() - 256;
		        itemIDs[18] = config.get("Item", "Purgatory Boots", 2019).getInt() - 256;
		        itemIDs[19] = config.get("Item", "Adamantine Helm", 2020).getInt() - 256;
		        itemIDs[20] = config.get("Item", "Adamantine Chestplate", 2019).getInt() - 256;
		        itemIDs[21] = config.get("Item", "Adamantine Leggings", 2021).getInt() - 256;
		        itemIDs[22] = config.get("Item", "Adamantine Boots", 2022).getInt() - 256;
		        
		        config.save();
		        
		        titaniaChest = (new ItemArmorTitania(itemIDs[0], titania, 3, 1).setUnlocalizedName("titaniaChest").setTextureName("titania:titaniaChest").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(titaniaChest, "Heart Kreuz Chestplate");
		        
		        titaniaSkirt = (new ItemArmorTitania(itemIDs[1], titania, 3, 2).setUnlocalizedName("titaniaSkirt").setTextureName("titania:titaniaSkirt").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(titaniaSkirt, "Heart Kreuz Skirt");
		        
		        titaniaBoots = (new ItemArmorTitania(itemIDs[2], titania, 3, 3).setUnlocalizedName("titaniaBoots").setTextureName("titania:titaniaBoots").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(titaniaBoots, "Heart Kreuz Boots");
		        
		        heavenHead = (new ItemArmorHeavensWheel(itemIDs[4], heaven, 3, 0).setUnlocalizedName("heavenHead").setTextureName("titania:heavenHead").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(heavenHead, "Heaven's Wheel Headpiece");
		        
		        heavenChest = (new ItemArmorHeavensWheel(itemIDs[5], heaven, 3, 1).setUnlocalizedName("heavenChest").setTextureName("titania:heavenChest").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(heavenChest, "Heaven's Wheel Chestplate");
		        
		        heavenSkirt = (new ItemArmorHeavensWheel(itemIDs[6], heaven, 3, 2).setUnlocalizedName("heavenSkirt").setTextureName("titania:heavenSkirt").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(heavenSkirt, "Heaven's Wheel Skirt");
		        
		        heavenBoots = (new ItemArmorHeavensWheel(itemIDs[7], heaven, 3, 3).setUnlocalizedName("heavenBoots").setTextureName("titania:heavenBoots").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(heavenBoots, "Heaven's Wheel Boots");
		        
		        blackwingChest = (new ItemArmorBlackwing(itemIDs[8], blackwing, 3, 1).setUnlocalizedName("blackwingChest").setTextureName("titania:blackwingChest").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(blackwingChest, "Blackwing Chestplate");
		        
		        blackwingLegs = (new ItemArmorBlackwing(itemIDs[9], blackwing, 3, 2).setUnlocalizedName("blackwingLegs").setTextureName("titania:blackwingLegs").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(blackwingLegs, "Blackwing Leggings");
		        
		        blackwingBoots = (new ItemArmorBlackwing(itemIDs[10], blackwing, 3, 3).setUnlocalizedName("blackwingBoots").setTextureName("titania:blackwingBoots").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(blackwingBoots, "Blackwing Boots");
		        
		        flightEars = (new ItemArmorFlight(itemIDs[11], flight, 3, 0).setUnlocalizedName("flightEars").setTextureName("titania:flightEars").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(flightEars, "Flight Ears");
		        
		        flightPlate = (new ItemArmorFlight(itemIDs[12], flight, 3, 1).setUnlocalizedName("flightPlate").setTextureName("titania:flightPlate").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(flightPlate, "Flight Chestplate");
		        
		        flightLeggings = (new ItemArmorFlight(itemIDs[13], flight, 3, 2).setUnlocalizedName("flightLeggings").setTextureName("titania:flightLeggings").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(flightLeggings, "Flight Leggings");
		        
		        flightBoots = (new ItemArmorFlight(itemIDs[14], flight, 3, 3).setUnlocalizedName("flightBoots").setTextureName("titania:flightBoots").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(flightBoots, "Flight Boots");
		        
		        purgatoryHead = (new ItemArmorPurgatory(itemIDs[15], purgatory, 3, 0).setUnlocalizedName("purgatoryHead").setTextureName("titania:purgatoryHead").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(purgatoryHead, "Purgatory Headpiece");
		        
		        purgatoryChest = (new ItemArmorPurgatory(itemIDs[16], purgatory, 3, 1).setUnlocalizedName("purgatoryChest").setTextureName("titania:purgatoryChest").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(purgatoryChest, "Purgatory Chestplate");
		        
		        purgatoryLegs = (new ItemArmorPurgatory(itemIDs[17], purgatory, 3, 2).setUnlocalizedName("purgatoryLegs").setTextureName("titania:purgatoryLegs").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(purgatoryLegs, "Purgatory Leggings");
		        
		        purgatoryBoots = (new ItemArmorPurgatory(itemIDs[18], purgatory, 3, 3).setUnlocalizedName("purgatoryBoots").setTextureName("titania:purgatoryBoots").setCreativeTab(CreativeTabs.tabCombat));
		        LanguageRegistry.addName(purgatoryBoots, "Purgatory Boots");
			}
	
}
