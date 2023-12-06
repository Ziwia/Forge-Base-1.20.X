package net.ziwi.basemod.entity.custom;

import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.ziwi.basemod.entity.ModEntities;

public class SantaPresent extends AbstractHurtingProjectile  {
    public SantaPresent(EntityType<? extends SantaPresent> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public SantaPresent(Level pLevel, LivingEntity pShooter, double pOffsetX, double pOffsetY, double pOffsetZ) {
        super(ModEntities.SANTA_PRESENT.get(), pShooter, pOffsetX, pOffsetY, pOffsetZ, pLevel);
    }



    /**
     * Called when the arrow hits an entity
     */
//    protected void onHitEntity(EntityHitResult pResult) {
//        super.onHitEntity(pResult);
//        if (!this.level().isClientSide) {
//            Entity entity = pResult.getEntity();
//            Entity entity1 = this.getOwner();
//            boolean flag;
//            if (entity1 instanceof LivingEntity) {
//                LivingEntity livingentity = (LivingEntity)entity1;
//                flag = entity.hurt(this.damageSources().witherSkull(this, livingentity), 8.0F);
//                if (flag) {
//                    if (entity.isAlive()) {
//                        this.doEnchantDamageEffects(livingentity, entity);
//                    } else {
//                        livingentity.heal(5.0F);
//                    }
//                }
//            } else {
//                flag = entity.hurt(this.damageSources().magic(), 5.0F);
//            }
//
//            if (flag && entity instanceof LivingEntity) {
//                LivingEntity livingentity1 = (LivingEntity)entity;
//                int i = 0;
//                if (this.level().getDifficulty() == Difficulty.NORMAL) {
//                    i = 10;
//                } else if (this.level().getDifficulty() == Difficulty.HARD) {
//                    i = 40;
//                }
//
//                if (i > 0) {
//                    livingentity1.addEffect(new MobEffectInstance(MobEffects.WITHER, 20 * i, 1), this.getEffectSource());
//                }
//            }
//
//        }
//    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            this.level().explode(this, this.getX(), this.getY(), this.getZ(), 1.0F, false, Level.ExplosionInteraction.MOB);
            this.discard();
        }

    }


}
