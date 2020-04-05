package mortvana.artmisc.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import mortvana.artmisc.util.item.FluxGearItem;

public class ArtMiscLib {
	public static final String MOD_ID = "ArtificersMiscellanea";
	public static final String MOD_NAME = "Artificer's Miscellanea";
	public static final String MOD_VERSION = "v0.0.1-1";
	public static final String MOD_DEPENDENCIES =
			"after:thaumcraft;" +
			"after:ThermalFoundation;" +
			"after:ProjRed|Exploration;" +
			"after:ReactorCraft;" +
			"after:GeoStrata;" +
			"after:Artifice;" +
			"after:arsmagica2";

	public static CreativeTabs tab;

	public static Block blockReactorOre;

	public static FluxGearItem itemGeneral;
	public static Item itemStone;
}
