package com.sweetrpg.minecraft.gamemaster.datagen;

import com.sweetrpg.minecraft.gamemaster.Constants;
import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {

    public ModRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Registration.USURPER_ITEM.get())
                .pattern(" D ")
                .pattern("DED")
                .pattern("ODO")
                .define('D', Items.DIAMOND)
                .define('E', Items.ENDER_EYE)
                .define('O', Items.OBSIDIAN)
                .group(Constants.MOD_ID)
                .unlockedBy("diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .unlockedBy("ender_eye", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ENDER_EYE))
                .unlockedBy("obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OBSIDIAN))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.ROD_ITEM.get())
                .pattern("*E*")
                .pattern(" S ")
                .pattern(" S ")
                .define('*', ItemTags.SMALL_FLOWERS)
                .define('E', Items.EMERALD_BLOCK)
                .define('S', Items.CHISELED_STONE_BRICKS)
                .group(Constants.MOD_ID)
                .unlockedBy("emerald", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .unlockedBy("chiseled_stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CHISELED_STONE_BRICKS))
//                .unlockedBy("emerald", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.USURPER_ITEM.get()),
                        Registration.SCEPTER_ITEM.get(),
                        0, // experience
                        500) // cooking time
                .group(Constants.MOD_ID)
                .unlockedBy("gm_usurper", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.USURPER_ITEM.get()))
                .save(consumer);
    }
}