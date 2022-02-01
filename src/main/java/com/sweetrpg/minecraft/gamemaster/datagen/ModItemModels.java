package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.GameMaster;
import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.sweetrpg.minecraft.gamemaster.util.Utils.modResLocStr;

public class ModItemModels extends ItemModelProvider {

    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GameMaster.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(Registration.SCEPTER_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(GameMaster.MOD_ID, "item/gm_scepter"));
        singleTexture(Registration.USURPER_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(GameMaster.MOD_ID, "item/gm_usurper"));
        singleTexture(Registration.ROD_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(GameMaster.MOD_ID, "item/player_rod"));
//        singleTexture(Registration.FIRSTITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
//                "layer0", new ResourceLocation(MyTutorial.MODID, "item/firstitem"));
//        withExistingParent(Registration.SCEPTER_ITEM.get().getRegistryName().getPath(), modResLocStr("block/scepter_block"));
    }
}