package de.pilz.sammelsorium;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import de.pilz.sammelsorium.blocks.BlockSeaLantern;
import de.pilz.sammelsorium.items.blocks.ItemBlockSeaLantern;
import de.pilz.sammelsorium.strings.BlockNames;

public class RegisterManagement {

    public static Block blockSeaLantern = new BlockSeaLantern();

    public static void RegisterAllItems() {

    }

    public static void RegisterAllBlocks() {
        GameRegistry.registerBlock(blockSeaLantern, ItemBlockSeaLantern.class, BlockNames.SEA_LANTERN);
    }
}
