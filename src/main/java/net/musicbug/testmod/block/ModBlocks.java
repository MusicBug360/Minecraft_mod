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
import net.musicbug.testmod.block.custom.KillBlock;
import net.musicbug.testmod.block.custom.MisautiumBooster;
import net.musicbug.testmod.block.custom.SolunariumLampBlock;

public class ModBlocks {
    public static final Block MISAUTIUM_BLOCK = registerBlock("misautium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(4)), ItemGroup.BUILDING_BLOCKS);

    public static final Block ANTILIGHT = registerBlock("antilight",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f).luminance(-20)), ItemGroup.BUILDING_BLOCKS);

    public static final Block HAMBURGER_BLOCK = registerBlock("hamburger_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f)), ItemGroup.SEARCH);

    public static final Block MISAUTIUM_BOOSTER = registerBlock("misautium_booster",
            new MisautiumBooster(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(4)), ItemGroup.REDSTONE);

    public static final Block KILL_BLOCK = registerBlock("kill_block",
            new KillBlock(FabricBlockSettings.of(Material.STONE)), ItemGroup.REDSTONE);

    public static final Block SOLUNARIUM_LAMP = registerBlock("solunarium_lamp",
            new SolunariumLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(state -> state.get(SolunariumLampBlock.LIT) ? 100 : 0)), ItemGroup.REDSTONE);

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
