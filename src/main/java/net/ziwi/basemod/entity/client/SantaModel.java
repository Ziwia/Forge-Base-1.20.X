package net.ziwi.basemod.entity.client;// Made with Blockbench 4.9.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class SantaModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "santa"), "main");
	private final ModelPart Santa;
	private final ModelPart bb_main;

	public SantaModel(ModelPart root) {
		this.Santa = root.getChild("Santa");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Santa = partdefinition.addOrReplaceChild("Santa", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Sleighbase = Santa.addOrReplaceChild("Sleighbase", CubeListBuilder.create().texOffs(78, 96).addBox(-16.0F, -4.0F, -20.0F, 4.0F, 4.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(32, 106).addBox(-16.0F, -12.0F, -20.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-16.0F, -12.0F, -24.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(77, 105).addBox(12.0F, -12.0F, -20.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 12).addBox(12.0F, -12.0F, -24.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(12.0F, -4.0F, -20.0F, 4.0F, 4.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(0, 104).addBox(12.0F, -8.0F, -12.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(61, 80).addBox(-16.0F, -8.0F, -12.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(38, 79).addBox(-16.0F, -8.0F, 8.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(12.0F, -8.0F, 8.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(61, 64).addBox(-16.0F, -12.0F, -12.0F, 32.0F, 4.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(126, 122).addBox(-16.0F, -20.0F, -12.0F, 32.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(66, 44).addBox(-16.0F, -20.0F, -20.0F, 32.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(124, 140).addBox(-16.0F, -24.0F, 12.0F, 32.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(12.0F, -16.0F, -8.0F, 4.0F, 8.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(12.0F, -20.0F, 0.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-16.0F, -20.0F, 0.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-16.0F, -16.0F, -8.0F, 4.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Sleighbase.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 104).addBox(56.0F, -24.0F, 8.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(61, 105).addBox(28.0F, -24.0F, 8.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-44.0F, 0.0F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition Reindeer = Santa.addOrReplaceChild("Reindeer", CubeListBuilder.create().texOffs(86, 123).addBox(-12.0F, -8.0F, -40.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(70, 123).addBox(8.0F, -8.0F, -40.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 123).addBox(8.0F, -8.0F, -60.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(114, 12).addBox(-12.0F, -8.0F, -60.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(114, 0).addBox(-12.0F, -16.0F, -60.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(72, 140).addBox(-8.0F, -32.0F, -72.0F, 16.0F, 8.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(66, 16).addBox(-4.0F, -28.0F, -76.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Reindeer.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 8.0F, -44.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Reindeer.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 109).addBox(-8.0F, -40.0F, -64.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = Reindeer.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(114, 0).addBox(0.0F, -40.0F, -64.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r5 = Reindeer.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 0).addBox(-4.0F, -36.0F, -56.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Reigns = Santa.addOrReplaceChild("Reigns", CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -22.0F, -65.0F, 2.0F, 2.0F, 57.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(14.0F, -22.0F, -70.0F, 2.0F, 2.0F, 62.0F, new CubeDeformation(0.0F))
		.texOffs(114, 32).addBox(-15.0F, -25.0F, -75.0F, 31.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Reigns.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 93).addBox(-15.0F, 8.0F, -78.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(92, 96).addBox(14.0F, 8.0F, -78.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition fatty = Santa.addOrReplaceChild("fatty", CubeListBuilder.create().texOffs(0, 123).addBox(-12.0F, -27.0F, -10.0F, 24.0F, 9.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(-5.0F, -43.0F, -2.0F, 11.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(140, 46).addBox(-7.0F, -45.0F, -4.0F, 15.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 83).addBox(-5.0F, -47.0F, -2.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(66, 28).addBox(-3.0F, -49.0F, -1.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.0F, -51.0F, 1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(61, 64).addBox(-3.0F, -41.0F, 0.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(126, 96).addBox(-12.0F, -32.0F, -5.0F, 24.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = fatty.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 34).addBox(16.3534F, -29.319F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -21.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r8 = fatty.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 64).addBox(45.0F, 22.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(28, 5).addBox(46.0F, 25.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.4435F));

		PartDefinition cube_r9 = fatty.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 28).addBox(54.0F, 1.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition cube_r10 = fatty.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 0).addBox(49.0F, -24.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.3963F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(61, 96).addBox(11.0F, -33.0F, -1.0F, 16.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-27.0F, -33.0F, -1.0F, 16.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Santa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Santa;
	}
}