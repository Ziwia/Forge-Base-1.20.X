package net.ziwi.basemod.entity.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.resources.ResourceLocation;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.elfEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class elfModel extends GeoModel<elfEntity> {
    @Override
    public ResourceLocation getModelResource(elfEntity animatable) {
        return new ResourceLocation(BaseMod.MOD_ID,"geo/elf.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(elfEntity animatable) {
        return new ResourceLocation(BaseMod.MOD_ID,"textures/entity/elf.png");
    }

    @Override
    public ResourceLocation getAnimationResource(elfEntity animatable) {
        return new ResourceLocation(BaseMod.MOD_ID,"animations/elf.animation.json");
    }

    @Override
    public void setCustomAnimations(elfEntity animatable, long instanceId, AnimationState<elfEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if(head!=null){
            EntityModelData eData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(eData.headPitch() * ((float)Math.PI / 180F));
            head.setRotY(eData.headPitch() * ((float)Math.PI / 180F));
        }


        super.setCustomAnimations(animatable, instanceId, animationState);
    }

//    public void setCustomAnimations(elfEntity animatable, long uniqueID, AnimationState state){
//        CoreGeoBone head = this.getBone("head");
//    }

}
