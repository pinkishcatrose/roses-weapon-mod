package com.rose.vanillatoolmaterials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.rose.main.COMPRESSED_COBBLESTONE;
import static net.minecraft.item.Items.IRON_INGOT;

public class vanillaironmaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 250;
    }
    public static final vanillaironmaterial INSTANCE = new vanillaironmaterial();
    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(IRON_INGOT);
    }
}
