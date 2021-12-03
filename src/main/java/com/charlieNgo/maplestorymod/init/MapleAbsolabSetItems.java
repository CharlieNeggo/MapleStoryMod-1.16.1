package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleAbsolabArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleAbsolabItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MapleAbsolabSetItems {

    //Weapons for AbsoLab Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<AxeItem> ABSOLAB_POLEARM = ITEMS.register("absolab_polearm", () ->
            new AxeItem(MapleAbsolabItemTier.ABSOLAB, 25, -3.0F, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_TWOHANDED_SWORD = ITEMS.register("absolab_twohanded_sword", () ->
            new SwordItem(MapleAbsolabItemTier.ABSOLAB, 20, -2.0F, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_DAGGER = ITEMS.register("absolab_dagger", () ->
            new SwordItem(MapleAbsolabItemTier.ABSOLAB, 19, 0.5F, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_KATARA = ITEMS.register("absolab_katara", () ->
            new SwordItem(MapleAbsolabItemTier.ABSOLAB, 15, 0.5F, new Item.Properties().group(MapleStoryMod.TAB)));

    //Armor for AbsoLab Set
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CAP = ITEMS.register("absolab_bandit_cap", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlotType.HEAD, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CHEST = ITEMS.register("absolab_bandit_chest", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlotType.CHEST, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_LEGGINGS = ITEMS.register("absolab_bandit_leggings", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlotType.LEGS, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_SHOES = ITEMS.register("absolab_knight_shoes", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlotType.FEET, new Item.Properties().group(MapleStoryMod.TAB)));
}
