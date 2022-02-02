package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.Constants;
import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.sweetrpg.minecraft.gamemaster.Constants.*;
import static com.sweetrpg.minecraft.gamemaster.GameMaster.MOD_ID;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Constants.ITEMGROUP_PREFIX + GAMEMASTER_TAB_ID, "Game Master");

        add(Registration.SCEPTER_ITEM.get(), GM_SCEPTER_NAME);
        add(Registration.USURPER_ITEM.get(), GM_USURPER_NAME);
        add(Registration.ROD_ITEM.get(), PLAYER_ROD_NAME);
    }
}
