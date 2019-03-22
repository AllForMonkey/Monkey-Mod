package com.afm.AfmMod.tabs;

import com.afm.AfmMod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AfmModTab extends CreativeTabs 
{
	public AfmModTab(String label) { super("afmmodtab");
	this.setBackgroundImageName("afmmod.png");}
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.Banana);}
	public boolean hasSearchBar() {return true;}
}
