package net.ziwi.basemod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.elfEntity;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BaseMod.MOD_ID);

    public static final RegistryObject<EntityType<elfEntity>> ELF = ENTITY_TYPES.register("elf",()
        ->EntityType.Builder.of(elfEntity::new, MobCategory.CREATURE).sized(1,1)
            .build(String.valueOf(new ResourceLocation(BaseMod.MOD_ID,"elf"))));
    public static void register(IEventBus e) {
        ENTITY_TYPES.register(e);
    }
}
