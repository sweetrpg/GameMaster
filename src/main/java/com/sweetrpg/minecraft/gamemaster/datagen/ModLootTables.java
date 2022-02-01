package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.data.DataGenerator;

public class ModLootTables extends BaseLootTableProvider {

    public ModLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
//        lootTables.put(Registration.FIRSTBLOCK.get(), createStandardTable("firstblock", Registration.FIRSTBLOCK.get(), Registration.FIRSTBLOCK_TILE.get()));
//        lootTables.put(Registration.FANCYBLOCK.get(), createStandardTable("fancyblock", Registration.FANCYBLOCK.get(), Registration.FANCYBLOCK_TILE.get()));
    }
}