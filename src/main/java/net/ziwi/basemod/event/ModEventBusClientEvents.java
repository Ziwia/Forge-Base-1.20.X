package net.ziwi.basemod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.client.ElfModel;
import net.ziwi.basemod.entity.client.ModModelLayers;
import net.ziwi.basemod.entity.client.SantaModel;
import net.ziwi.basemod.entity.client.SantaPresentModel;

@Mod.EventBusSubscriber(modid = BaseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ELF_LAYER, ElfModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SANTA_LAYER, SantaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SANTA_PRESENT_LAYER, SantaPresentModel::createBodyLayer);


    }
}