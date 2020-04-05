package mortvana.artmisc.exintegratio;

import java.util.List;

import net.minecraft.block.BlockSand;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mortvana.artmisc.common.ArtMiscLib;

public class BlockReactorOre extends BlockSand {
	@SideOnly(Side.CLIENT)
	public IIcon[] icon = new IIcon[16];

	public BlockReactorOre() {
		super();
		setHardness(0.4F);
		setStepSound(soundTypeSand);
		setCreativeTab(ArtMiscLib.tab);
	}

	@Override
	public void registerBlockIcons(IIconRegister register) {
		icon[0] = register.registerIcon("artmisc:exintegratio/oreGravelCadmium");
		icon[1] = register.registerIcon("artmisc:exintegratio/oreGravelIndium");
		icon[2] = register.registerIcon("artmisc:exintegratio/oreGravelPitchblende");
		icon[3] = register.registerIcon("artmisc:exintegratio/oreGravelThorite");
		icon[5] = register.registerIcon("artmisc:exintegratio/oreSandCadmium");
		icon[6] = register.registerIcon("artmisc:exintegratio/oreSandIndium");
		icon[7] = register.registerIcon("artmisc:exintegratio/oreSandPitchblende");
		icon[8] = register.registerIcon("artmisc:exintegratio/oreSandThorite");
		icon[10] = register.registerIcon("artmisc:exintegratio/oreDustCadmium");
		icon[11] = register.registerIcon("artmisc:exintegratio/oreDustIndium");
		icon[12] = register.registerIcon("artmisc:exintegratio/oreDustPitchblende");
		icon[13] = register.registerIcon("artmisc:exintegratio/oreDustThorite");
		icon[15] = register.registerIcon("artmisc:exintegratio/oreGravelPitchblendeEnd");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icon[meta];
	}

	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tabs, List subItems) {
		subItems.add(new ItemStack(item, 1, 0));
		subItems.add(new ItemStack(item, 1, 1));
		subItems.add(new ItemStack(item, 1, 2));
		subItems.add(new ItemStack(item, 1, 3));
		subItems.add(new ItemStack(item, 1, 5));
		subItems.add(new ItemStack(item, 1, 6));
		subItems.add(new ItemStack(item, 1, 7));
		subItems.add(new ItemStack(item, 1, 8));
		subItems.add(new ItemStack(item, 1, 10));
		subItems.add(new ItemStack(item, 1, 11));
		subItems.add(new ItemStack(item, 1, 12));
		subItems.add(new ItemStack(item, 1, 13));
		subItems.add(new ItemStack(item, 1, 15));

	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public String getUnlocalizedName() {
		return "tile.artmisc.reactorOreDust";
	}
}
