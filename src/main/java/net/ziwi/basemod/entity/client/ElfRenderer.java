package net.ziwi.basemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.ElfEntity;

public class ElfRenderer extends MobRenderer<ElfEntity, ElfModel<ElfEntity>> {
    public ElfRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ElfModel<>(pContext.bakeLayer(ModModelLayers.ELF_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ElfEntity pEntity) {
        return new ResourceLocation(BaseMod.MOD_ID, "textures/entity/elf.png");
    }

    @Override
    public void render(ElfEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStackIn, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()){
            pMatrixStackIn.scale(0.3F,0.3F,0.3F);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStackIn, pBuffer, pPackedLight);
    }
}
