package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

import java.util.function.Consumer;

public class ABOERecipes extends RecipeProvider
{
    public ABOERecipes(PackOutput output)
    {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ALUMINIUM_BLOCK.get())
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ItemRegistry.ALUMINIUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.COPPER_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ItemRegistry.COPPER_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ENERGIZED_BLOCK.get())
                .pattern("eee")
                .pattern("eee")
                .pattern("eee")
                .define('e', ItemRegistry.ENERGIZED_INGOT.get())
                .group(Constants.MOD_ID).unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.IRIDIUM_BLOCK.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemRegistry.IRIDIUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.LEAD_BLOCK.get())
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ItemRegistry.LEAD_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.NICKEL_BLOCK.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.NICKEL_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PLATINUM_BLOCK.get())
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ItemRegistry.PLATINUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SILVER_BLOCK.get())
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ItemRegistry.SILVER_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.TIN_BLOCK.get())
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ItemRegistry.TIN_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.URANIUM_BLOCK.get())
                .pattern("uuu")
                .pattern("uuu")
                .pattern("uuu")
                .define('u', ItemRegistry.URANIUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.ALUMINIUM_GEAR.get())
                .pattern(" a ")
                .pattern("a a")
                .pattern(" a ")
                .define('a', ItemRegistry.ALUMINIUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.COPPER_GEAR.get())
                .pattern(" c ")
                .pattern("c c")
                .pattern(" c ")
                .define('c', ItemRegistry.COPPER_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.ENERGIZED_GEAR.get())
                .pattern(" e ")
                .pattern("e e")
                .pattern(" e ")
                .define('e', ItemRegistry.ENERGIZED_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ENERGIZED_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.IRIDIUM_GEAR.get())
                .pattern(" i ")
                .pattern("i i")
                .pattern(" i ")
                .define('i', ItemRegistry.IRIDIUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.LEAD_GEAR.get())
                .pattern(" l ")
                .pattern("l l")
                .pattern(" l ")
                .define('l', ItemRegistry.LEAD_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.NICKEL_GEAR.get())
                .pattern(" n ")
                .pattern("n n")
                .pattern(" n ")
                .define('n', ItemRegistry.NICKEL_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.PLATINUM_GEAR.get())
                .pattern(" p ")
                .pattern("p p")
                .pattern(" p ")
                .define('p', ItemRegistry.PLATINUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.SILVER_GEAR.get())
                .pattern(" s ")
                .pattern("s s")
                .pattern(" s ")
                .define('s', ItemRegistry.SILVER_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.TIN_GEAR.get())
                .pattern(" t ")
                .pattern("t t")
                .pattern(" t ")
                .define('t', ItemRegistry.TIN_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("tin", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.URANIUM_GEAR.get())
                .pattern(" u ")
                .pattern("u u")
                .pattern(" u ")
                .define('u', ItemRegistry.URANIUM_INGOT.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.ALUMINIUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.ALUMINIUM_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.COPPER_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.COPPER_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.ENERGIZED_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.ENERGIZED_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ENERGIZED_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.IRIDIUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.IRIDIUM_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.LEAD_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.LEAD_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.NICKEL_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.NICKEL_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.PLATINUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.PLATINUM_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.SILVER_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.SILVER_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.TIN_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.TIN_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.URANIUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.URANIUM_NUGGET.get())
                .group(Constants.MOD_ID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.ALUMINIUM_NUGGET.get(), 9)
                .requires(ItemRegistry.ALUMINIUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.COPPER_NUGGET.get(), 9)
                .requires(ItemRegistry.COPPER_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_NUGGET.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.ENERGIZED_NUGGET.get(), 9)
                .requires(ItemRegistry.ENERGIZED_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ENERGIZED_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.IRIDIUM_NUGGET.get(), 9)
                .requires(ItemRegistry.IRIDIUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.LEAD_NUGGET.get(), 9)
                .requires(ItemRegistry.LEAD_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.NICKEL_NUGGET.get(), 9)
                .requires(ItemRegistry.NICKEL_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.PLATINUM_NUGGET.get(), 9)
                .requires(ItemRegistry.PLATINUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.SILVER_NUGGET.get(), 9)
                .requires(ItemRegistry.SILVER_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.TIN_NUGGET.get(), 9)
                .requires(ItemRegistry.TIN_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.URANIUM_NUGGET.get(), 9)
                .requires(ItemRegistry.URANIUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_NUGGET.get()))
                .save(consumer);


        //TODO Smelting and Blasting recipes
    }
}
