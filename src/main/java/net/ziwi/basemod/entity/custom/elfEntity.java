package net.ziwi.basemod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomFlyingGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import javax.print.attribute.Attribute;

import static net.minecraft.world.entity.ai.attributes.Attributes.SPAWN_REINFORCEMENTS_CHANCE;

public class elfEntity extends Zombie {

    public elfEntity(EntityType<? extends Zombie> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    public static AttributeSupplier setAttributes(){
        return Zombie.createAttributes()
                .add(Attributes.MAX_HEALTH, 45.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .add(Attributes.ATTACK_DAMAGE, 9.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.50D)
                .add(Attributes.FOLLOW_RANGE, 55.0D)
                .add(Attributes.FLYING_SPEED, 0.25D).add(Attributes.ATTACK_SPEED, 0.9D)
                .add(SPAWN_REINFORCEMENTS_CHANCE, 0.5D)
                .build();
    }



    @Override
    protected boolean isSunSensitive() {
        return false;
    }

    @Override
    public boolean isBaby() {
        return true;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1,new FloatGoal(this));
        this.goalSelector.addGoal(2,new MeleeAttackGoal(this,1.0D,true));
        this.goalSelector.addGoal(4,new WaterAvoidingRandomFlyingGoal(this,1.0D));
        this.goalSelector.addGoal(5,new WaterAvoidingRandomStrollGoal(this,1.0D));

        this.targetSelector.addGoal(1,new NearestAttackableTargetGoal<>(this, Player.class,true));

        super.registerGoals();
    }


}