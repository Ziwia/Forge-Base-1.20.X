package net.ziwi.basemod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.ModEntities;
import net.ziwi.basemod.entity.custom.elfEntity;

@Mod.EventBusSubscriber(modid = BaseMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void EntityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntities.ELF.get(), elfEntity.setAttributes());

    }
}
