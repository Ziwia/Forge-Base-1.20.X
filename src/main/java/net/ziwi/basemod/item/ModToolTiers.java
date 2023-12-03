package net.ziwi.basemod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier CANDY = TierSortingRegistry.registerTier(
            new ForgeTier(
                    6,
                    10000,
                    20.0F,
                    10.0F,
                    12,
                    ModTags.Blocks.NEEDS_CANDY,
                    ()-> Ingredient.of(ModItems.CONDENSED_SUGAR.get())),
            new ResourceLocation(BaseMod.MOD_ID, "candy"),
            List.of(Tiers.NETHERITE),
            List.of());
}
