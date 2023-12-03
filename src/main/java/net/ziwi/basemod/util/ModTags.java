package net.ziwi.basemod.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.ziwi.basemod.BaseMod;

public class ModTags {
    public static class Blocks {
      public static final TagKey<Block> NEEDS_CANDY = tag("needs_candy");
      private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(BaseMod.MOD_ID, name));
      }

    }

    public static class Items {

        }
    }

