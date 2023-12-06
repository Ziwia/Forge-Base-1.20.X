package net.ziwi.basemod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PowerableMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.ziwi.basemod.entity.ModEntities;


public class SantaEntity extends WitherBoss implements PowerableMob, RangedAttackMob {

    public SantaEntity(EntityType<? extends WitherBoss> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Override
    protected void registerGoals(){
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.0D, 40, 20.0F));

        //add in candy cane

        super.registerGoals();
    }

    /**
     * Launches a Wither skull toward (par2, par4, par6)
     */

    private void performRangedAttack(int pHead, LivingEntity pTarget) {
        this.performRangedAttack(pHead, pTarget.getX(), pTarget.getY() + (double)pTarget.getEyeHeight() * 0.5D, pTarget.getZ(), pHead == 0 && this.random.nextFloat() < 0.001F);
    }

    /**
     * Launches a Wither skull toward (par2, par4, par6)
     */
    private void performRangedAttack(int pHead, double pX, double pY, double pZ, boolean pIsDangerous) {
//        if (!this.isSilent()) {
//            this.level().levelEvent((Player)null, 1024, this.blockPosition(), 0);
//        }

        double d0 = this.getX();
        double d1 = this.getY();
        double d2 = this.getZ();
        double d3 = pX - d0;
        double d4 = pY - d1;
        double d5 = pZ - d2;
        SantaPresent santaPresent = new SantaPresent( this.level(), this,d3,d4,d5);
        santaPresent.setOwner(this);
//        santaPresent.setDangerous(true);

        santaPresent.setPosRaw(d0, d1, d2);
        this.level().addFreshEntity(santaPresent);
    }

    /**
     * Attack the specified entity using a ranged attack.
     */
    @Override
    public void performRangedAttack(LivingEntity pTarget, float pDistanceFactor) {
        this.performRangedAttack(0, pTarget);
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
