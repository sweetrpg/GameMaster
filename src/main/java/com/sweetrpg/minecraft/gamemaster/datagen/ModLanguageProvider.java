package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.Constants;
import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.sweetrpg.minecraft.gamemaster.GameMaster.MOD_ID;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Constants.ITEMGROUP_PREFIX + Constants.GAMEMASTER_TAB, "Game Master");

        add(Registration.SCEPTER_ITEM.get(), "GM Scepter");
        add(Registration.USURPER_ITEM.get(), "GM Usurper");
        add(Registration.ROD_ITEM.get(), "Player Rod");
    }
}
