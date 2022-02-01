package com.sweetrpg.minecraft.gamemaster.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import static com.sweetrpg.minecraft.gamemaster.GameMaster.MOD_ID;

public class ModItemTags extends ItemTagsProvider {

    public ModItemTags(DataGenerator gen, BlockTagsProvider provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, provider, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }
}
