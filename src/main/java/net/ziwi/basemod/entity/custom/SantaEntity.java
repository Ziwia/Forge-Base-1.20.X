package net.ziwi.basemod.entity.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PowerableMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;


public class SantaEntity extends WitherBoss implements PowerableMob, RangedAttackMob {
    public SantaEntity(EntityType<? extends WitherBoss> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }




    @Override
    protected void registerGoals(){
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(2, new RangedAttackGoal(this, 100.0D, 4, 100.0F));
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
//    (int pHead, double pX, double pY, double pZ, boolean pIsDangerous)

    @Override
    public void performRangedAttack(LivingEntity pTarget, float pVelocity){
        double pX = pTarget.getX();
        double pY = pTarget.getY();
        double pZ = pTarget.getZ();
        double d3 = pX - this.getX();
        double d4 = pY - this.getY();
        double d5 = pZ - this.getZ();


        WitherSkull witherskull =  new SantaPresent(EntityType.WITHER_SKULL, this.level());
        witherskull.setOwner(this);
        witherskull.setDangerous(true);
//        witherskull.setPosRaw(this.getX(), this.getY()+1, this.getZ());
        witherskull.setPos(d3, d4,d5);
        this.level().addFreshEntity(witherskull);

    }
}
