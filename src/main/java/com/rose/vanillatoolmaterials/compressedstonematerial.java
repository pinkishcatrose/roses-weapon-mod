package com.rose.vanillatoolmaterials;

import com.rose.item.compressed_cobblestone;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.rose.main.COMPRESSED_COBBLESTONE;
import static net.minecraft.item.Items.*;

public class compressedstonematerial implements ToolMaterial {
    public static final compressedstonematerial INSTANCE = new compressedstonematerial();
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
        return Ingredient.ofItems(COMPRESSED_COBBLESTONE);
    }
}
