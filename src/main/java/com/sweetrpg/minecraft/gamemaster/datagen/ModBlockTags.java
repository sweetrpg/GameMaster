package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.Constants;
import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import static com.sweetrpg.minecraft.gamemaster.GameMaster.MOD_ID;

public class ModBlockTags extends BlockTagsProvider {

    public ModBlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        //tag(BlockTags.MINEABLE_WITH_PICKAXE)

    }

    @Override
    public String getName() {
        return Constants.BLOCK_TAGS_NAME;
    }
}
