package net.musicbug.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.musicbug.testmod.TestMod;

public class ModBlocks {
    public static final Block PROGRIUM_BLOCK = registerBlock("progrium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(2)), ItemGroup.BUILDING_BLOCKS);

    public static final Block ANTILIGHT = registerBlock("antilight",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f).luminance(-20)), ItemGroup.BUILDING_BLOCKS);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.debug("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
