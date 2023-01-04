package net.musicbug.testmod.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.musicbug.testmod.TestMod;

public class ModPaintings {
    public static final PaintingVariant ERUPTION = registerPainting("eruption", new PaintingVariant(16,16));
    public static final PaintingVariant I_FOUND = registerPainting("i_found", new PaintingVariant(64,64));
    public static final PaintingVariant SUSSY_SHOWDOWN = registerPainting("sussy_showdown", new PaintingVariant(32,32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(TestMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        TestMod.LOGGER.debug("Registering Paintings for " + TestMod.MOD_ID);
    }
}
