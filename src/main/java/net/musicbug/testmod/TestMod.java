package net.musicbug.testmod;

import net.fabricmc.api.ModInitializer;
import net.musicbug.testmod.block.ModBlocks;
import net.musicbug.testmod.item.ModItems;
import net.musicbug.testmod.painting.ModPaintings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();


	}
}

