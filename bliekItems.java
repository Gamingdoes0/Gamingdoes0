package Gamingdoes0;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;


public class bliekItems extends Item {
public bliekItems(int par1) {
super(par1); //Returns super constructor: par1 is ID
setCreativeTab(CreativeTabs.tabMaterials); //Tells the game what creative mode tab it goes in
}
}