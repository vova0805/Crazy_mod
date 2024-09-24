
package net.mcreator.crazymod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@CrazyModModElements.ModElement.Tag
public class BlockofdecoratedfossilsBlock extends CrazyModModElements.ModElement {

	@ObjectHolder("crazy_mod:blockofdecoratedfossils")
	public static final Block block = null;

	public BlockofdecoratedfossilsBlock(CrazyModModElements instance) {
		super(instance, 5);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(6f, 20f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("blockofdecoratedfossils");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
