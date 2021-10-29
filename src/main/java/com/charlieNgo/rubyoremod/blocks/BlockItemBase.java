package com.charlieNgo.rubyoremod.blocks;

import com.charlieNgo.rubyoremod.RubyOreMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(RubyOreMod.TAB));
    }
}
