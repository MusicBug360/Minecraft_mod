package net.musicbug.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.musicbug.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.musicbug.testmod.item.custom.DSixItem;

public class ModItems {

    public static final Item RAW_MUSICITE = registerItem("raw_progrium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MUSICITE = registerItem("progrium_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item D_SIX = registerItem("d_six",
            new DSixItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.debug("Registering Mod Items for " + TestMod.MOD_ID);
    }
}
