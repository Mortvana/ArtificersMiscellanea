package mortvana.artmisc.common;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;

import mortvana.artmisc.exintegratio.ExIntegratioContent;
import mortvana.artmisc.util.FluxGearCreativeTab;
import mortvana.artmisc.util.item.FluxGearItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.registry.GameRegistry;

import mortvana.artmisc.util.helpers.LoadedHelper;
import mortvana.artmisc.util.module.ModuleLoader;

import static mortvana.artmisc.common.ArtMiscLib.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, dependencies = MOD_DEPENDENCIES)
public class ArtificersMiscellanea {

	@Instance
	public static ArtificersMiscellanea instance;

	//@SidedProxy(clientSide = "mortvana.thaumrev.network.ClientProxy", serverSide = "mortvana.thaumrev.network.CommonProxy", modId = ThaumRevLibrary.MOD_ID)
	//public static CommonProxy proxy;

	// Move to Melted Dashboard Core once I have enough stuff to warrant creating it as a separate library.
	public static final Logger logger = LogManager.getLogger("Artificer's Miscellanea");

	public static ArtMiscConfig config;
	public static ModuleLoader modules;

	/* *=-=-=-=* Initialization Sequence *=-=-=-=* */
	/**
	 *	Runs before other things, reading configs, registering handlers, creating blocks, items, and whatever, including
	 *	registering things with GameRegistry.
	 *
	 *  @param event - The FMLPreInitializationEvent passed by Forge Mod Loader.
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new ArtMiscConfig(event, "/Mortvana/ArtificersMiscellanea.cfg");
		//TODO: Fix Modules
		//modules.addModule("ExIntegratio", ArtMiscConfig.enableExIntegratio && LoadedHelper.isExNihiloLoaded, new ExIntegratioContent(), null);


		tab = new FluxGearCreativeTab("Artificer's Miscelllanea", "artMisc");

		itemGeneral = new FluxGearItem("artmisc", tab).setFolder("general");
		itemGeneral.setUnlocalizedName("general", "artmisc.general");
		itemGeneral.addItem(0, "dummy");

		//modules.preInit(event);
		if (ArtMiscConfig.enableExIntegratio && LoadedHelper.isExNihiloLoaded) {
			ExIntegratioContent.preInit();
		}
	}

	/**
	 *	Register recipes, OreDict stuff, send IMC messages and basically everything else that isn't in postInit.
	 *
	 *	@param event  - The FMLPreInitializationEvent passed by Forge Mod Loader.
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Initialize Libraries here
		((FluxGearCreativeTab) tab).setItem(new ItemStack(Items.potato));
		if (ArtMiscConfig.enableExIntegratio && LoadedHelper.isExNihiloLoaded) {
			ExIntegratioContent.init();
		}
		//modules.init(event);
	}

	/**
	 *	Handle interactions with other mods, initialize research, and register aspects.
	 *
	 *	@param event - The FMLPreInitializationEvent passed by Forge Mod Loader.
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//modules.postInit(event);
		if (ArtMiscConfig.enableExIntegratio && LoadedHelper.isExNihiloLoaded) {
			ExIntegratioContent.postInit();
		}
	}


}
