package net.ziwi.basemod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PowerableMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.Level;


public class SantaEntity extends WitherBoss implements PowerableMob, RangedAttackMob {
    public SantaEntity(EntityType<? extends WitherBoss> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Override
    protected void registerGoals(){
        this.goalSelector.addGoal(0, new FloatGoal(this));
        //add in candy cane

        super.registerGoals();
    }

    public static AttributeSupplier.Builder createAttributes() {
        return WitherBoss.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 300.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.6F)
                .add(Attributes.FLYING_SPEED, (double)0.6F)
                .add(Attributes.FOLLOW_RANGE, 40.0D)
                .add(Attributes.ARMOR, 4.0D);
    }
}
