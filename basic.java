package Gamingdoes0; //Package directory




import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


/*
* Basic needed forge stuff
*/
@Mod(modid="healthmod",name="Health Mod",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class basic {

	
	
	private Object itemIcon;

	public void registerIcons(IconRegister par1IconRegister)
    {
            this.itemIcon = par1IconRegister.registerIcon("healthmod" + ":" + (this.getUnlocalizedName().substring(5)));
    }
/*
* ToolMaterial
*/


//Telling forge that we are creating these

private String getUnlocalizedName() {
		// TODO Auto-generated method stub
		return null;
	}


public static Item bandage;

//Declaring Init
@Init
public void load(FMLInitializationEvent event){
// define items/blocks


	bandage = new bliekItems(2013).setUnlocalizedName("bandage");


//adding names


LanguageRegistry.addName(bandage, "Bandage");


//crafting








}

}