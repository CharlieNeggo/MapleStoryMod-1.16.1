package com.charlieNgo.rubyoremod.tools;

import com.charlieNgo.rubyoremod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    RUBY(3, 1700, 10.5F, 3.0F, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
    });

    private final int harvestLevel;
    private final int maxUses ;
    private final float Efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float Efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.Efficiency = Efficiency;
        this.enchantability = enchantability;
        this.attackDamage = attackDamage;
        this.repairMaterial = repairMaterial;

    }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return Efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
