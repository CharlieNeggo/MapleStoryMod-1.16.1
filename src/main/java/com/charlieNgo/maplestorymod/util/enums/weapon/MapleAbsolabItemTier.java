package com.charlieNgo.maplestorymod.util.enums.weapon;

import com.charlieNgo.maplestorymod.init.MapleModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MapleAbsolabItemTier implements IItemTier {
    ABSOLAB(2, 3700, 10.5F, 4.0F, 12, () -> {
        return Ingredient.fromItems(MapleModItems.ABSOLAB_ESSENCE.get());
    });

    private final int harvestLevel;
    private final int maxUses ;
    private final float Efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    MapleAbsolabItemTier(int harvestLevel, int maxUses, float Efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
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
