package com.charlieNgo.rubyoremod.armor;

import com.charlieNgo.rubyoremod.RubyOreMod;
import com.charlieNgo.rubyoremod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    RUBY(RubyOreMod.MOD_ID + ":ruby", 50, new int [] { 4, 7, 8, 4 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F, () -> { return Ingredient.fromItems(RegistryHandler.RUBY.get()); });

    private static final int [] MAX_DAMAGE = new int [] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int [] damageReductionAmountArray;
    private final int enchantabiltiy;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabiltiy, SoundEvent soundEvent, float toughness, Supplier<Ingredient>
                     repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantabiltiy = enchantabiltiy;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return null;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }
}
