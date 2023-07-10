package com.rose;

import com.rose.item.*;
import com.rose.vanillatoolmaterials.*;
import eu.pb4.polymer.core.api.item.PolymerItemUtils;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.nbt.NbtElement;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.text.html.parser.Entity;

import java.util.Random;

import static net.minecraft.entity.EntityType.*;

public class main implements ModInitializer {
    public static final String MOD_ID = "rose";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    ///items
    // Gas Masks
    public static final Item DEFAULT_GAS_MASK =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gas_mask_default"),
                    new gasmask(new FabricItemSettings()));
    //Compressed Cobblestone
    public static final Item COMPRESSED_COBBLESTONE =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "compressed_cobblestone"),
                    new compressed_cobblestone(new FabricItemSettings()));
    //Compressed Iron
    public static final Item COMPRESSED_IRON =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "compressed_iron"),
                    new compressed_iron(new FabricItemSettings()));
    //Compressed Iron
    public static final Item COMPRESSED_DIAMOND =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "compressed_diamond"),
                    new compressed_diamond(new FabricItemSettings()));
    /// Healing items and Power Stones
    private static final Identifier INFECTED_HEART_LOOT_TABLE0 = ZOMBIE.getLootTableId(); // zombie loot table add infected heart
    private static final Identifier INFECTED_HEART_LOOT_TABLE1 = HUSK.getLootTableId(); // husk loot table add infected heart
    private static final Identifier INFECTED_HEART_LOOT_TABLE2 = DROWNED.getLootTableId(); // husk loot table add infected heart
    //Infection Curing
    //Infected Heart
    public static final Item INFECTED_HEART =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "infected_heart"),
                    new infected_heart(new FabricItemSettings()));
    //Cured Heart
    public static final Item CURED_HEART =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cured_heart"),
                    new cured_heart(new FabricItemSettings()));
    //Stuffed Cured Heart
    public static final Item STUFFED_CURED_HEART =
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stuffed_cured_heart"),
                    new stuffed_cured_heart(new FabricItemSettings()));
    // Heavy Swords
    public static ToolItem GREAT_WOODEN_SWORD = new great_wooden_sword(vanillawoodmaterial.INSTANCE, 7, -3.8F, new Item.Settings());
    public static ToolItem GREAT_STONE_SWORD = new great_stone_sword(compressedstonematerial.INSTANCE, 8, -3.8F, new Item.Settings());
    public static ToolItem GREAT_IRON_SWORD = new great_iron_sword(compressedironmaterial.INSTANCE, 12, -3.8F, new Item.Settings());
    public static ToolItem GREAT_DIAMOND_SWORD = new great_diamond_sword(compresseddiamondmaterial.INSTANCE, 16, -3.8F, new Item.Settings());
    public static ToolItem GREAT_NETHERITE_SWORD = new great_netherite_sword(compressednetheritematerial.INSTANCE, 19, -3.8F, new Item.Settings());

    // Knifes
    public static ToolItem KNIFE_WOODEN = new knife_wooden(vanillawoodmaterial.INSTANCE, 0, 65, new Item.Settings());
    public static ToolItem KNIFE_STONE = new knife_stone(vanillastonematerial.INSTANCE, 0, 65, new Item.Settings());
    public static ToolItem KNIFE_IRON = new knife_iron(vanillaironmaterial.INSTANCE, 0, 65, new Item.Settings());
    public static ToolItem KNIFE_DIAMOND = new knife_diamond(vanilladiamondmaterial.INSTANCE, 1, 65, new Item.Settings());
    public static ToolItem KNIFE_NETHERITE = new knife_netherite(vanillanetheritematerial.INSTANCE, 1, 65, new Item.Settings());

    @Override
    public void onInitialize() {
        /// Add infected heart to zombie entity
            LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                if (source.isBuiltin() && INFECTED_HEART_LOOT_TABLE0.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .with(ItemEntry.builder(INFECTED_HEART));
                    tableBuilder.pool(poolBuilder);
                }
            });
        /// end Add infected heart to zombie entity
        /// Add infected heart to husk entity
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && INFECTED_HEART_LOOT_TABLE1.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .with(ItemEntry.builder(INFECTED_HEART));
                tableBuilder.pool(poolBuilder);
            }
        });
        /// end Add infected heart to husk entity
        /// Add infected heart to drowned entity
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && INFECTED_HEART_LOOT_TABLE2.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .with(ItemEntry.builder(INFECTED_HEART));
                tableBuilder.pool(poolBuilder);
            }
        });
        /// end Add infected heart to drowned entity

        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "great_wooden_sword"), GREAT_WOODEN_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "knife_wooden"), KNIFE_WOODEN);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "great_stone_sword"), GREAT_STONE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "knife_stone"), KNIFE_STONE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "great_iron_sword"), GREAT_IRON_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "knife_iron"), KNIFE_IRON);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "great_diamond_sword"), GREAT_DIAMOND_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "knife_diamond"), KNIFE_DIAMOND);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "great_netherite_sword"), GREAT_NETHERITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "knife_netherite"), KNIFE_NETHERITE);
        LOGGER.info("");
        LOGGER.info("Loading Rose's Weapons and Items");
        LOGGER.info("NOTE: Its best to use this mod with the Infected Datapack, as some of the items added by this mod are made specifically for it.");
        LOGGER.info("");
    }
}