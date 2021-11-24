package com.charlieNgo.rubyoremod.items;

import com.charlieNgo.rubyoremod.RubyOreMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Poop extends Item {

    public Poop () {
        super(new Item.Properties().group(RubyOreMod.TAB)
                .group(RubyOreMod.TAB)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(3.5f)
                        .effect(new EffectInstance(Effects.HEALTH_BOOST, 30*20, 2), 1)
                        .effect(new EffectInstance(Effects.LEVITATION, 30*20, 2), 1)
                        .meat()
                        .setAlwaysEdible()
                        .build())
        );
    }
}
