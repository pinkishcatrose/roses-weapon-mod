package com.rose.vanillatoolmaterials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static net.minecraft.item.Items.*;

public class stonematerial implements ToolMaterial {
    public static final stonematerial INSTANCE = new stonematerial();
    @Override
    public int getDurability() {
        return 131;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(COBBLESTONE, COBBLED_DEEPSLATE, BLACKSTONE);
    }
}
