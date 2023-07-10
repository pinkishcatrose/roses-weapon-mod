package com.rose.vanillatoolmaterials;

import net.minecraft.recipe.Ingredient;
import com.rose.item.compressed_cobblestone;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static net.minecraft.item.Items.*;

public class vanillawoodmaterial implements ToolMaterial {
    public static final vanillawoodmaterial INSTANCE = new vanillawoodmaterial();
    @Override
    public int getDurability() {
        return 59;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ACACIA_PLANKS, BAMBOO_PLANKS, BIRCH_PLANKS, CHERRY_PLANKS, BIRCH_PLANKS, CRIMSON_PLANKS, DARK_OAK_PLANKS, JUNGLE_PLANKS, MANGROVE_PLANKS, OAK_PLANKS, SPRUCE_PLANKS, WARPED_PLANKS);
    }
}
