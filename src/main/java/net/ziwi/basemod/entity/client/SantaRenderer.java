package net.ziwi.basemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.ElfEntity;
import net.ziwi.basemod.entity.custom.SantaEntity;

public class SantaRenderer extends MobRenderer<SantaEntity, SantaModel<SantaEntity>> {
    public SantaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SantaModel<>(pContext.bakeLayer(ModModelLayers.SANTA_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(SantaEntity pEntity) {
        return new ResourceLocation(BaseMod.MOD_ID, "textures/entity/santa.png");
    }


    @Override
    public void render(SantaEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStackIn, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()){
            pMatrixStackIn.scale(0.3F,0.3F,0.3F);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStackIn, pBuffer, pPackedLight);
    }
}
