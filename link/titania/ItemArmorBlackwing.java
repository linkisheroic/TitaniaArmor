package link.titania;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmorBlackwing extends ItemArmor
{

	public ItemArmorBlackwing(int par1,
			EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
	}
	
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {

		if(player.getCurrentItemOrArmor(4) == null && player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null)
		{
			 ItemStack helmet = player.getCurrentItemOrArmor(4);
			 ItemStack plate = player.getCurrentItemOrArmor(3);
			 ItemStack legs = player.getCurrentItemOrArmor(2);
			 ItemStack boots = player.getCurrentItemOrArmor(1); 
			 
			 if (plate.getItem() == MainMod.blackwingChest && legs.getItem() == MainMod.blackwingLegs && boots.getItem() == MainMod.blackwingBoots) 
			 {
				if(Keyboard.isKeyDown(Keyboard.KEY_1) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.capabilities.allowFlying = false;
					player.setCurrentItemOrArmor(4, null);
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.titaniaChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.titaniaSkirt));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.titaniaBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_2) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.capabilities.allowFlying = true;
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.heavenHead));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.heavenChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.heavenSkirt));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.heavenBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_3) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.capabilities.allowFlying = true;
					player.setCurrentItemOrArmor(4, null);
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.blackwingChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.blackwingLegs));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.blackwingBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_4) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.flightEars));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.flightPlate));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.flightLeggings));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.flightBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_5) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.purgatoryHead));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.purgatoryChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.purgatoryLegs));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.purgatoryBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_6) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.adamantineHelm));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.adamantineChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.adamantineLegs));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.adamantineBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_7) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.seaHelm));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.seaChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.seaSkirt));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.seaBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_8) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.flameHelm));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.flameChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.flameLegs));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.flameBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_9) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.giantHelm));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.giantChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.giantLegs));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.giantBoots));
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_0) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
				{
					player.setCurrentItemOrArmor(4, new ItemStack(MainMod.fairyHead));
					player.setCurrentItemOrArmor(3, new ItemStack(MainMod.fairyChest));
					player.setCurrentItemOrArmor(2, new ItemStack(MainMod.fairyLegs));
					player.setCurrentItemOrArmor(1, new ItemStack(MainMod.fairyBoots));
				}
			 }
		}

	}
}
