package mortvana.artmisc.exintegratio;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import exnihilo.items.ItemStone;

public class ItemFancyStone extends ItemStone {
	public IIcon[] icons = new IIcon[28];

	public ItemFancyStone() {
		super();
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		return getUnlocalizedName() + "." + item.getItemDamage();
	}

	@Override
	public String getUnlocalizedName() {
		return "item.artmisc.fancyStone";
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List subItems) {
		for(int i = 0; i < 28; i++) {
			subItems.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public void registerIcons(IIconRegister register) {
		icons[0] = register.registerIcon("artmisc:fancyStone/marblePR");
		icons[1] = register.registerIcon("artmisc:fancyStone/basaltPR");
		icons[2] = register.registerIcon("artmisc:fancyStone/basaltGS");
		icons[3] = register.registerIcon("artmisc:fancyStone/marbleGS");
		icons[4] = register.registerIcon("artmisc:fancyStone/graniteGS");
		icons[5] = register.registerIcon("artmisc:fancyStone/limestoneGS");
		icons[6] = register.registerIcon("artmisc:fancyStone/shaleGS");
		icons[7] = register.registerIcon("artmisc:fancyStone/sandstoneGS");
		icons[8] = register.registerIcon("artmisc:fancyStone/pumiceGS");
		icons[9] = register.registerIcon("artmisc:fancyStone/slateGS");
		icons[10] = register.registerIcon("artmisc:fancyStone/gneissGS");
		icons[11] = register.registerIcon("artmisc:fancyStone/peridotiteGS");
		icons[12] = register.registerIcon("artmisc:fancyStone/quartzGS");
		icons[13] = register.registerIcon("artmisc:fancyStone/granuliteGS");
		icons[14] = register.registerIcon("artmisc:fancyStone/hornfelGS");
		icons[15] = register.registerIcon("artmisc:fancyStone/migmatiteGS");
		icons[16] = register.registerIcon("artmisc:fancyStone/schistGS");
		icons[17] = register.registerIcon("artmisc:fancyStone/onyxGS");
		icons[18] = register.registerIcon("artmisc:fancyStone/opalGS");
		icons[19] = register.registerIcon("artmisc:fancyStone/basaltArt");
		icons[20] = register.registerIcon("artmisc:fancyStone/marbleArt");
		icons[21] = register.registerIcon("artmisc:fancyStone/grayLimeArt");
		icons[22] = register.registerIcon("artmisc:fancyStone/lGrayLimeArt");
		icons[23] = register.registerIcon("artmisc:fancyStone/brownLimeArt");
		icons[24] = register.registerIcon("artmisc:fancyStone/tanLimeArt");
		icons[25] = register.registerIcon("artmisc:fancyStone/redLimeArt");
		icons[26] = register.registerIcon("artmisc:fancyStone/blueLimeArt");
		icons[27] = register.registerIcon("artmisc:fancyStone/greenLimeArt");
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
		return icons[meta];
	}


}
