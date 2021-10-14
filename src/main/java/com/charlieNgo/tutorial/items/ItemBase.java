package com.charlieNgo.tutorial.items;

import com.charlieNgo.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item{

    public ItemBase() {
        super(new Item.Properties().group(Tutorial.TAB));
    }
}
