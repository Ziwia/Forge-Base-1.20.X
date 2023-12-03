package net.ziwi.basemod.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

import static net.minecraft.world.entity.ai.attributes.Attributes.SPAWN_REINFORCEMENTS_CHANCE;

public class ElfEntity extends Zombie {


    public ElfEntity(EntityType<? extends Zombie> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }



    @Override
    protected void registerGoals(){
        this.goalSelector.addGoal(0, new FloatGoal(this));
        //add in candy cane
        this.targetSelector.addGoal(1,new NearestAttackableTargetGoal<>(this, Player.class,true));
//        this.goalSelector.addGoal(1, new TemptGoal(this,1.2D, Ingredient.of(Items.CAKE), false));
        this.goalSelector.addGoal(2,new MeleeAttackGoal(this,1.0D,true));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5,new WaterAvoidingRandomFlyingGoal(this,1.0D));
        this.goalSelector.addGoal(6,new WaterAvoidingRandomStrollGoal(this,1.0D));

        super.registerGoals();
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Zombie.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .add(Attributes.ATTACK_DAMAGE, 9.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.50D)
                .add(Attributes.FOLLOW_RANGE, 55.0D)
                .add(Attributes.FLYING_SPEED, 0.25D)
                .add(Attributes.ATTACK_SPEED, 0.9D)
                .add(SPAWN_REINFORCEMENTS_CHANCE, 0.7D);
    }

    @Override
    protected boolean isSunSensitive() {
        return false;
    }

    @Override
    public boolean isBaby() {
        return true;
    }
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.DONKEY_AMBIENT;
    }
}


