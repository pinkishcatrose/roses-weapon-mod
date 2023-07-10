package com.rose.vanillatoolmaterials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.rose.main.COMPRESSED_DIAMOND;

public class compresseddiamondmaterial implements ToolMaterial {
    public static final compresseddiamondmaterial INSTANCE = new compresseddiamondmaterial();
    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8;
    }

    @Override
    public float getAttackDamage() {
        return 3;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(COMPRESSED_DIAMOND);
    }
}
