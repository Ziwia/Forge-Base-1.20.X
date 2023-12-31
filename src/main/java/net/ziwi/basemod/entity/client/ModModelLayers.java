package net.ziwi.basemod.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.ziwi.basemod.BaseMod;

public class ModModelLayers {
    public static final ModelLayerLocation ELF_LAYER = new ModelLayerLocation(
            new ResourceLocation(BaseMod.MOD_ID, "elf_layer"), "main");

    public static final ModelLayerLocation SANTA_LAYER = new ModelLayerLocation(
            new ResourceLocation(BaseMod.MOD_ID, "santa_layer"), "main");

    public static final ModelLayerLocation SANTA_PRESENT_LAYER = new ModelLayerLocation(
            new ResourceLocation(BaseMod.MOD_ID, "santa_present_layer"), "main");
}
