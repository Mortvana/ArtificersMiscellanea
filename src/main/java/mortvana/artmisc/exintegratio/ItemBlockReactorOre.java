package mortvana.artmisc.exintegratio;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockReactorOre extends ItemBlock {
	public ItemBlockReactorOre(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		return getUnlocalizedName() + item.getItemDamage();
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}
}