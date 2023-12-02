package net.ziwi.basemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.elfEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class elfRenderer extends GeoEntityRenderer<elfEntity> {
    public elfRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager,new elfModel());
    }

    @Override
    public ResourceLocation getTextureLocation(elfEntity entity) {
        return new ResourceLocation(BaseMod.MOD_ID,"textures/entity/elf.png");
    }

    @Override
    public void render(elfEntity entity, float entityYaw, float partialTicks, PoseStack matrixStackIn, net.minecraft.client.renderer.MultiBufferSource bufferIn, int packedLightIn){
        if(entity.isBaby()){
            matrixStackIn.scale(0.3F,0.3F,0.3F);
        }

        super.render(entity,entityYaw,partialTicks,matrixStackIn,bufferIn,packedLightIn);
    }
}
