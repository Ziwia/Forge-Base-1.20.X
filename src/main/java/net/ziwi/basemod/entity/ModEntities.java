package net.ziwi.basemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.ElfEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BaseMod.MOD_ID);

    public static final RegistryObject<EntityType<ElfEntity>> ELF =
            ENTITY_TYPES.register("elf", () -> EntityType.Builder.of(ElfEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 2.5f).build("elf"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
