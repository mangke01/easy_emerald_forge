package com.kwpugh.easy_emerald.tools;

import com.kwpugh.easy_emerald.tools.base.HammerBase;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class EmeraldHammer extends HammerBase
{
	public EmeraldHammer(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.EMERALD;
	}
}