package com.rose.item;

import eu.pb4.polymer.core.api.block.PolymerHeadBlock;
import net.minecraft.block.Block;

public class gasmaskitem extends gasmasktextures {

    public <T extends Block & PolymerHeadBlock> gasmaskitem(T block, Settings settings) {
        super(block, settings);
    }
}
