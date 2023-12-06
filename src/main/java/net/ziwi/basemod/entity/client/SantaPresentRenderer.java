package net.ziwi.basemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitherSkullRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.SantaEntity;
import net.ziwi.basemod.entity.custom.SantaPresent;

public class SantaPresentRenderer extends EntityRenderer<SantaPresent> {
    public SantaPresentRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(SantaPresent pEntity) {
        return new ResourceLocation(BaseMod.MOD_ID, "textures/entity/santa_present.png");

    }

}
