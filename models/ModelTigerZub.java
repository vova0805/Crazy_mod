// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTigerZub extends EntityModel<Entity> {
	private final ModelRenderer legs;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer tale;
	private final ModelRenderer cube_r2;

	public ModelTigerZub() {
		textureWidth = 128;
		textureHeight = 128;

		legs = new ModelRenderer(this);
		legs.setRotationPoint(-3.0F, 24.0F, -5.0F);
		legs.setTextureOffset(62, 71).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		legs.setTextureOffset(74, 71).addBox(6.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		legs.setTextureOffset(12, 76).addBox(5.0F, -5.0F, 18.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		legs.setTextureOffset(0, 75).addBox(-1.0F, -5.0F, 18.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		legs.setTextureOffset(48, 42).addBox(6.0F, -2.0F, -3.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		legs.setTextureOffset(58, 42).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		legs.setTextureOffset(68, 42).addBox(5.0F, -2.0F, 16.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		legs.setTextureOffset(50, 77).addBox(-1.0F, -2.0F, 16.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 17.0F, -7.0F);
		head.setTextureOffset(22, 66).addBox(-3.0F, -6.0F, -2.0F, 7.0F, 7.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(50, 11).addBox(-3.0F, -6.0F, -9.0F, 7.0F, 4.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 66).addBox(-2.0F, -5.0F, -15.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(42, 62).addBox(-3.0F, -2.0F, -8.0F, 7.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(68, 62).addBox(-1.0F, -2.0F, -14.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(78, 0).addBox(-2.0F, -2.0F, -15.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(78, 6).addBox(2.0F, -2.0F, -15.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -5.0F, -5.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.48F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(42, 77).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(34, 76).addBox(6.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(4.0F, 24.0F, -7.0F);
		body.setTextureOffset(0, 25).addBox(-9.0F, -14.0F, 0.0F, 11.0F, 8.0F, 13.0F, 0.0F, false);
		body.setTextureOffset(0, 46).addBox(-8.0F, -13.0F, 13.0F, 9.0F, 8.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(42, 46).addBox(-8.0F, -16.0F, 0.0F, 9.0F, 4.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(42, 71).addBox(-7.0F, -15.0F, 12.0F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(50, 0).addBox(-6.0F, -14.0F, 15.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -7.0F, 1.0F, 3.0F, 3.0F, 22.0F, 0.0F, false);
		body.setTextureOffset(24, 76).addBox(-5.0F, -12.0F, 25.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		tale = new ModelRenderer(this);
		tale.setRotationPoint(0.25F, 14.5F, 19.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tale.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.829F, 0.0F);
		cube_r2.setTextureOffset(48, 25).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 15.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		legs.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		tale.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.legs.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}