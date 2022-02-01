package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.setup.Registration;
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
        tag(Registration.RPG_ITEMS_TAG)
                .add(Registration.ROD_ITEM.get())
                .add(Registration.SCEPTER_ITEM.get())
                .add(Registration.USURPER_ITEM.get());
    }
}
