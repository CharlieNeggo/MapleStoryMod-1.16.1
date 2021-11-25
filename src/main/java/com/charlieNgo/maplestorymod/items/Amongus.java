package com.charlieNgo.maplestorymod.items;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Amongus extends Item {
    public Amongus () {
        super(new Item.Properties().group(MapleStoryMod.TAB)
                .group(MapleStoryMod.TAB)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(3.5f)
                        .effect(new EffectInstance(Effects.HEALTH_BOOST, 40*20, 2), 1)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 40*20, 2), 1)
                        .effect(new EffectInstance(Effects.HASTE, 40*20, 2), 1)
                        .effect(new EffectInstance(Effects.JUMP_BOOST, 40*20, 2), 1)
                        .effect(new EffectInstance(Effects.INVISIBILITY, 40*20, 2), 1)
                        .meat()
                        .setAlwaysEdible()
                        .build()));
    }
}
