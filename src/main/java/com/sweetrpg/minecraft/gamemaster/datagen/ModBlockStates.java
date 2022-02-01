package com.sweetrpg.minecraft.gamemaster.datagen;
import com.sweetrpg.minecraft.gamemaster.GameMaster;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStates extends BlockStateProvider {

    public ModBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GameMaster.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        simpleBlock(Registration.MAGICBLOCK.get());
//        registerFirstBlock();
//        registerComplexMultipart();
    }
}