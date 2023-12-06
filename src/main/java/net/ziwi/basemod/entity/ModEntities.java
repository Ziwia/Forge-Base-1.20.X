package net.ziwi.basemod.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.entity.custom.ElfEntity;
import net.ziwi.basemod.entity.custom.SantaEntity;
import net.ziwi.basemod.entity.custom.SantaPresent;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BaseMod.MOD_ID);

    public static final RegistryObject<EntityType<ElfEntity>> ELF =
            ENTITY_TYPES.register("elf", () -> EntityType.Builder.of(ElfEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 2.5f).build("elf"));

    public static final RegistryObject<EntityType<SantaEntity>> SANTA =
            ENTITY_TYPES.register("santa", () -> EntityType.Builder.of(SantaEntity::new, MobCategory.MONSTER)
                    .sized(4.5f, 4.5f).build("santa"));

    public static final RegistryObject<EntityType<SantaPresent>> SANTA_PRESENT =
            ENTITY_TYPES.register("santa_present", () -> EntityType.Builder.<SantaPresent>of(SantaPresent::new, MobCategory.MISC)
                    .sized(0.3125F, 0.3125F)
                    .build("santa_present"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
