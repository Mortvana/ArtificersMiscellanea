package mortvana.artmisc.exintegratio;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;

import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import mortvana.artmisc.util.helpers.LoadedHelper;

import exnihilo.ENBlocks;
import exnihilo.registries.HammerRegistry;
import exnihilo.registries.SieveRegistry;
import mortvana.artmisc.common.ArtMiscConfig;

import static mortvana.artmisc.common.ArtMiscLib.*;

public class ExIntegratioContent /*implements IInitialized*/ {

	public static boolean fancyStones;

	//@Override
	public static void preInit() {
		fancyStones = ArtMiscConfig.fancyStones && (LoadedHelper.isArtificeLoaded || LoadedHelper.isGeoStrataLoaded || LoadedHelper.isProjectRedLoaded);
		if (LoadedHelper.isReactorCraftLoaded) {
			blockReactorOre = new BlockReactorOre();
			GameRegistry.registerBlock(blockReactorOre, ItemBlockReactorOre.class, "ReactorOreBlock");
		}
		if (fancyStones) {
			itemStone = new ItemFancyStone();
			GameRegistry.registerItem(itemStone, "fancyStone");
		}
	}

	//@Override
	public static void init() {
		if (LoadedHelper.isReactorCraftLoaded) {
			itemGeneral.addItem(1000, "oreGravelCadmium");
			itemGeneral.addItem(1001, "oreGravelIndium");
			itemGeneral.addItem(1002, "oreGravelPitchblende");
			itemGeneral.addItem(1003, "oreGravelThorite");
			itemGeneral.addItem(1005, "oreSandCadmium");
			itemGeneral.addItem(1006, "oreSandIndium");
			itemGeneral.addItem(1007, "oreSandPitchblende");
			itemGeneral.addItem(1008, "oreSandThorite");
			itemGeneral.addItem(1010, "oreDustCadmium");
			itemGeneral.addItem(1011, "oreDustIndium");
			itemGeneral.addItem(1012, "oreDustPitchblende");
			itemGeneral.addItem(1013, "oreDustThorite");
			itemGeneral.addItem(1015, "oreGravelPitchblendeEnd");

			squareRecipe(new ItemStack(itemGeneral, 1, 1000), new ItemStack(blockReactorOre, 1, 0));
			squareRecipe(new ItemStack(itemGeneral, 1, 1001), new ItemStack(blockReactorOre, 1, 1));
			squareRecipe(new ItemStack(itemGeneral, 1, 1002), new ItemStack(blockReactorOre, 1, 2));
			squareRecipe(new ItemStack(itemGeneral, 1, 1003), new ItemStack(blockReactorOre, 1, 3));
			squareRecipe(new ItemStack(itemGeneral, 1, 1005), new ItemStack(blockReactorOre, 1, 5));
			squareRecipe(new ItemStack(itemGeneral, 1, 1006), new ItemStack(blockReactorOre, 1, 6));
			squareRecipe(new ItemStack(itemGeneral, 1, 1007), new ItemStack(blockReactorOre, 1, 7));
			squareRecipe(new ItemStack(itemGeneral, 1, 1008), new ItemStack(blockReactorOre, 1, 8));
			squareRecipe(new ItemStack(itemGeneral, 1, 1010), new ItemStack(blockReactorOre, 1, 10));
			squareRecipe(new ItemStack(itemGeneral, 1, 1011), new ItemStack(blockReactorOre, 1, 11));
			squareRecipe(new ItemStack(itemGeneral, 1, 1012), new ItemStack(blockReactorOre, 1, 12));
			squareRecipe(new ItemStack(itemGeneral, 1, 1013), new ItemStack(blockReactorOre, 1, 13));
			squareRecipe(new ItemStack(itemGeneral, 1, 1015), new ItemStack(blockReactorOre, 1, 15));
		}
		if (fancyStones) {
			if (LoadedHelper.isProjectRedExploration) {
				ItemStack block = new ItemStack(GameRegistry.findBlock("ProjRed|Exploration", "projectred.exploration.stone"));
				squareRecipe(new ItemStack(itemStone, 1, 0), block);
				block.setItemDamage(2);
				squareRecipe(new ItemStack(itemStone, 1, 1), block);
			}
			if (LoadedHelper.isGeoStrataLoaded) {
				String gs = "GeoStrata";
				squareRecipe(new ItemStack(itemStone, 1, 2), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_basalt_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 3), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_marble_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 4), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_granite_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 5), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_limestone_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 6), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_shale_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 7), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_sandstone_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 8), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_pumice_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 9), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_slate_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 10), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_gneiss_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 11), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_peridotite_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 12), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_quartz_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 13), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_granulite_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 14), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_hornfel_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 15), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_migmatite_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 16), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_schist_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 17), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_onyx_cobble")));
				squareRecipe(new ItemStack(itemStone, 1, 18), new ItemStack(GameRegistry.findBlock(gs, "geostrata_rock_opal_cobble")));
			}
			if (LoadedHelper.isArtificeLoaded) {
				String art = "Artifice";
				squareRecipe(new ItemStack(itemStone, 1, 19), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.basalt"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 20), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.marble"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 21), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.gray"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 22), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.lightgray"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 23), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.brown"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 24), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.tan"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 25), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.reddish"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 26), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.bluish"), 1, 1));
				squareRecipe(new ItemStack(itemStone, 1, 27), new ItemStack(GameRegistry.findBlock(art, "tile.artifice.limestone.greenish"), 1, 1));
			}
		}
	}

	//@Override
	public static void postInit() {
		if (ArtMiscConfig.redundantSeeds) {
			if (LoadedHelper.isRotaryCraftLoaded) {
				SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("RotaryCraft", "rotarycraft_item_canola"), 0, 32);
			}
			if (LoadedHelper.isImmersiveEngineeringLoaded) {
				SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("ImmersiveEngineering", "seed"), 0, 32);
			}
			if (LoadedHelper.isGrowthcraftLoaded) {
				if (LoadedHelper.isGCApples) {
					SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("Growthcraft|Apples", "grc.appleSeeds"), 0, 64);
				}
				if (LoadedHelper.isGCGrapes) {
					SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("Growthcraft|Grapes", "grc.grapeSeeds"), 0, 64);
				}
				if (LoadedHelper.isGCHops) {
					SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("Growthcraft|Hops", "grc.hopSeeds"), 0, 64);
				}
				if (LoadedHelper.isGCRice) {
					SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("Growthcraft|Rice", "grc.rice"), 0, 96);
				}
			}
		}
		if (LoadedHelper.isGCBamboo) {
			SieveRegistry.register(Blocks.dirt, 0, GameRegistry.findItem("Growthcraft|Bamboo", "grc.bambooShoot"), 0, 32);
		}
		if (LoadedHelper.isThermalExpansionLoaded && LoadedHelper.isArsMagicaLoaded) {
			NBTTagCompound toSend = new NBTTagCompound();
			toSend.setInteger("energy", 8000);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			new ItemStack(GameRegistry.findItem("arsmagica2", "itemOre"), 1, 3).writeToNBT(toSend.getCompoundTag("input"));
			new FluidStack(FluidRegistry.getFluid("liquidessence"), 250).writeToNBT(toSend.getCompoundTag("output"));
			FMLInterModComms.sendMessage("ThermalExpansion", "CrucibleRecipe", toSend);
		}
		if (LoadedHelper.isReactorCraftLoaded) {
			SieveRegistry.register(Blocks.gravel, 0, itemGeneral, 1000, 128);
			SieveRegistry.register(Blocks.gravel, 0, itemGeneral, 1001, 128);
			SieveRegistry.register(Blocks.gravel, 0, itemGeneral, 1002, 128);
			SieveRegistry.register(ENBlocks.NetherGravel, 0, itemGeneral, 1003, 128);
			SieveRegistry.register(Blocks.sand, 0, itemGeneral, 1005, 128);
			SieveRegistry.register(Blocks.sand, 0, itemGeneral, 1006, 128);
			SieveRegistry.register(Blocks.sand, 0, itemGeneral, 1007, 128);
			SieveRegistry.register(ENBlocks.Dust, 0, itemGeneral, 1010, 128);
			SieveRegistry.register(ENBlocks.Dust, 0, itemGeneral, 1011, 128);
			SieveRegistry.register(ENBlocks.Dust, 0, itemGeneral, 1012, 128);
			SieveRegistry.register(ENBlocks.EnderGravel, 0, itemGeneral, 1015, 24);

			registerHammering(blockReactorOre, 0, itemGeneral, 1005);
			registerHammering(blockReactorOre, 1, itemGeneral, 1006);
			registerHammering(blockReactorOre, 2, itemGeneral, 1007);
			registerHammering(blockReactorOre, 3, itemGeneral, 1008);

			registerHammering(blockReactorOre, 5, itemGeneral, 1010);
			registerHammering(blockReactorOre, 6, itemGeneral, 1011);
			registerHammering(blockReactorOre, 7, itemGeneral, 1012);
			registerHammering(blockReactorOre, 8, itemGeneral, 1013);

			Item item = GameRegistry.findItem("ReactorCraft", "reactorcraft_item_raw");
			Item ingot = GameRegistry.findItem("ReactorCraft", "reactorcraft_item_ingots");
			ItemStack ingotU = new ItemStack(ingot);

			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 2), ingotU, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 7), ingotU, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 12), ingotU, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 15), ingotU, 0.1f);

			ItemStack ingotCd = new ItemStack(ingot, 1, 1);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 0), ingotCd, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 5), ingotCd, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 10), ingotCd, 0.1f);

			ItemStack ingotIn = new ItemStack(ingot, 1, 2);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 1), ingotIn, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 6), ingotIn, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 11), ingotIn, 0.1f);

			ItemStack ingotTh = new ItemStack(item, 1, 7);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 3), ingotTh, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 8), ingotTh, 0.1f);
			GameRegistry.addSmelting(new ItemStack(blockReactorOre, 1, 13), ingotTh, 0.1f);

			SieveRegistry.register(Blocks.gravel, 0, item, 5, 64);
			SieveRegistry.register(Blocks.gravel, 0, item, 6, 48);
			SieveRegistry.register(ENBlocks.NetherGravel, 0, item, 3, 32);

			Item itemF = GameRegistry.findItem("ReactorCraft", "reactorcraft_item_fluorite");
			if (ArtMiscConfig.multiFluorite) {
				for (int i = 0; i < 8; i++) {
					SieveRegistry.register(Blocks.sand, 0, itemF, i, 256);
				}
			} else {
				SieveRegistry.register(Blocks.sand, 0, itemF, 6, 32);
			}
		}
		if (LoadedHelper.isProjectRedExploration) {
			Item itemGem = GameRegistry.findItem("ProjRed|Core", "projectred.core.part");
			SieveRegistry.register(Blocks.gravel, 0, itemGem, 37, 80);
			SieveRegistry.register(Blocks.gravel, 0, itemGem, 38, 80);
			SieveRegistry.register(Blocks.gravel, 0, itemGem, 39, 80);
			SieveRegistry.register(ENBlocks.Dust, 0, itemGem, 56, 20);
		}
		if (fancyStones) { //TODO: Proportional output
			if (LoadedHelper.isProjectRedExploration) {
				siftStone(0);
				siftStone(1);
			}
			if (LoadedHelper.isGeoStrataLoaded) {
				siftStone(2);
				siftStone(3);
				siftStone(4);
				siftStone(5);
				siftStone(6);
				siftStone(7);
				siftStone(8);
				siftStone(9);
				siftStone(10);
				siftStone(11);
				siftStone(12);
				siftStone(13);
				siftStone(14);
				siftStone(15);
				siftStone(16);
				siftStone(17);
				siftStone(18);
			}
			if (LoadedHelper.isArtificeLoaded) {
				siftStone(19);
				siftStone(20);
				siftStone(21);
				siftStone(22);
				siftStone(23);
				siftStone(24);
				siftStone(25);
				siftStone(26);
				siftStone(27);
			}
			if (LoadedHelper.isExAstrisLoaded && ArtMiscConfig.chiselStones) {
				Item stone = GameRegistry.findItem("exastris", "chiselStone");
				SieveRegistry.register(Blocks.stone, 0, stone, 0, 16);
				SieveRegistry.register(Blocks.stone, 0, stone, 0, 32);
				SieveRegistry.register(Blocks.stone, 0, stone, 0, 64);
				SieveRegistry.register(Blocks.stone, 0, stone, 0, 128);
				SieveRegistry.register(Blocks.stone, 0, stone, 1, 16);
				SieveRegistry.register(Blocks.stone, 0, stone, 1, 32);
				SieveRegistry.register(Blocks.stone, 0, stone, 1, 64);
				SieveRegistry.register(Blocks.stone, 0, stone, 1, 128);
			}
		}
	}

	public static void registerHammering(Block block, int blockMeta, Item item, int itemMeta) {
		HammerRegistry.register(block, blockMeta, item, itemMeta, 1.00f, 0.0f);
		HammerRegistry.register(block, blockMeta, item, itemMeta, 1.00f, 0.0f);
		HammerRegistry.register(block, blockMeta, item, itemMeta, 1.00f, 0.0f);
		HammerRegistry.register(block, blockMeta, item, itemMeta, 1.00f, 0.0f);
		HammerRegistry.register(block, blockMeta, item, itemMeta, 0.50f, 0.1f);
		HammerRegistry.register(block, blockMeta, item, itemMeta, 0.05f, 0.1f);
		HammerRegistry.register(block, blockMeta, item, itemMeta, 0.0f, 0.05f);
	}

	public static void siftStone(int meta) {
		SieveRegistry.register(Blocks.stone, 0, itemStone, meta, 16);
		SieveRegistry.register(Blocks.stone, 0, itemStone, meta, 32);
		SieveRegistry.register(Blocks.stone, 0, itemStone, meta, 64);
		SieveRegistry.register(Blocks.stone, 0, itemStone, meta, 128);
	}

	public static void squareRecipe(ItemStack input, ItemStack output) {
		GameRegistry.addRecipe(output, "xx", "xx", 'x', input);
	}
}
