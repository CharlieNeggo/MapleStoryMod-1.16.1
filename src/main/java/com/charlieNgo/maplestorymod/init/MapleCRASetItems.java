package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleAbsolabArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleCraArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleAbsolabItemTier;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleCraItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MapleCRASetItems {

    //Weapons for AbsoLab Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<AxeItem> CRA_POLEARM = ITEMS.register("cra_polearm", () ->
            new AxeItem(MapleCraItemTier.CRA, 25, -3.0F, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> CRA_TWOHANDED_SWORD = ITEMS.register("cra_twohanded_sword", () ->
            new SwordItem(MapleCraItemTier.CRA, 20, -2.0F, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> CRA_DAGGER = ITEMS.register("cra_dagger", () ->
            new SwordItem(MapleCraItemTier.CRA, 19, 0.5F, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> CRA_KATARA = ITEMS.register("cra_katara", () ->
            new SwordItem(MapleCraItemTier.CRA, 15, 0.5F, new Item.Properties().group(MapleStoryMod.TAB)));

    //Armor for AbsoLab Set
    public static final RegistryObject<ArmorItem> CRA_BANDIT_CAP = ITEMS.register("cra_bandit_cap", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlotType.HEAD, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> CRA_BANDIT_CHEST = ITEMS.register("cra_bandit_chest", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlotType.CHEST, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> CRA_BANDIT_LEGGINGS = ITEMS.register("cra_bandit_leggings", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlotType.LEGS, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> CRA_KNIGHT_SHOES = ITEMS.register("cra_knight_shoes", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlotType.FEET, new Item.Properties().group(MapleStoryMod.TAB)));
}
