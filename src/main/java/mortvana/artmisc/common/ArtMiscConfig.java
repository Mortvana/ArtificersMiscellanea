package mortvana.artmisc.common;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import mortvana.artmisc.util.ConfigBase;

public class ArtMiscConfig extends ConfigBase {

	public static Configuration config;

	public ArtMiscConfig(FMLPreInitializationEvent event, String location) {
		super(event, location);
	}

	@Override
	public void loadConfig(File file) {
		ArtificersMiscellanea.logger.info("Loading Artificer's Miscellanea Config");
		config = new Configuration(file);
		config.load();

		enableExIntegratio = getModule("Ex Integratio", "Random Ex Nihilo integration", true);

		redundantSeeds = config.get("Ex Integratio", "Redundant Seeds", false, "Sifting dirt yields seeds you can get by punching grass").getBoolean(false);
		multiFluorite = config.get("Ex Integratio", "Fluorite Variety", false, "Enable sifting different colors of fluorite").getBoolean(false);
		fancyStones = config.get("Ex Integratio", "Fancy Stones", true, "Enable sifting stone for different stones").getBoolean(true);
		chiselStones = config.get("Ex Integratio", "Chisel Stones", false, "Use our values for sifting chisel stones. Requires Ex Astris").getBoolean(false);

		if (config.hasChanged()) {
			config.save();
		}
		ArtificersMiscellanea.logger.info("Artificer's Miscellanea Config Loaded");

	}

	public boolean getModule(String name, String description, boolean bool) {
		return config.get("Modules", "Enable " + name, bool, description).getBoolean();
	}

	public static boolean enableExIntegratio;

	public static boolean redundantSeeds;
	public static boolean multiFluorite;
	public static boolean fancyStones;
	public static boolean chiselStones;
}
