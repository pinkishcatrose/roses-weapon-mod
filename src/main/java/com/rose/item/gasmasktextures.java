package com.rose.item;

import eu.pb4.polymer.core.api.block.PolymerHeadBlock;
import eu.pb4.polymer.core.api.item.PolymerHeadBlockItem;
import net.minecraft.block.Block;

public class gasmasktextures extends PolymerHeadBlockItem {
    public <T extends Block & PolymerHeadBlock> gasmasktextures(T block, Settings settings) {
        super(block, settings);
    }
}
