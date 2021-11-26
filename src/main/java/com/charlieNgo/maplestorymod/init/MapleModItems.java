package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.blocks.BlockItemBase;
import com.charlieNgo.maplestorymod.items.Amongus;
//import com.charlieNgo.maplestorymod.items.Elixir;
import com.charlieNgo.maplestorymod.items.ItemBase;
import com.charlieNgo.maplestorymod.items.Poop;
import com.charlieNgo.maplestorymod.util.enums.MapleModArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.MapleModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MapleModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    public static final RegistryObject<Poop> POOP = ITEMS.register("poop", Poop::new);

//    public static final RegistryObject<Elixir> ELIXIR = ITEMS.register("elixir", Elixir::new);

    public static final RegistryObject<Amongus> AMONGUS = ITEMS.register("amongus", Amongus::new);


    // Tools
    //Kaiser Sword
    public static final RegistryObject<SwordItem> KAISER_KAISREUM = ITEMS.register("kaiser_kaisereum", () -> new SwordItem(MapleModItemTier.RUBY, 6, -2.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Dual Blade Dagger
    public static final RegistryObject<SwordItem> DUAL_BLADE_DAGGER = ITEMS.register("dual_blade_dagger", () -> new SwordItem(MapleModItemTier.RUBY, 6, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> DUAL_BLADE_KATARA = ITEMS.register("dual_blade_katara", () -> new SwordItem(MapleModItemTier.RUBY, 6, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> DICK = ITEMS.register("dick", () -> new SwordItem(MapleModItemTier.RUBY, 100, -0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(MapleModItemTier.RUBY, 4, -1.7F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Aran Axe
    public static final RegistryObject<AxeItem> ARAN_AXE_ONE = ITEMS.register("aran_axe_one", () -> new AxeItem(MapleModItemTier.RUBY, 8, -3.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Utgard Set for weapons
    public static final RegistryObject<AxeItem> UTGARD_POLEARM = ITEMS.register("utgard_polearm", () -> new AxeItem(MapleModItemTier.RUBY, 11, -3.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> UTGARD_TWOHANDED_SWORD = ITEMS.register("utgard_twohanded_sword", () -> new SwordItem(MapleModItemTier.RUBY, 11, -2.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> UTGARD_DAGGER = ITEMS.register("utgard_dagger", () -> new SwordItem(MapleModItemTier.RUBY, 11, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> UTGARD_KATARA = ITEMS.register("utgard_katara", () -> new SwordItem(MapleModItemTier.RUBY, 6, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));


    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(MapleModItemTier.RUBY, 3, -1.9F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(MapleModItemTier.RUBY, -1,-1.1F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(MapleModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(MapleModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(MapleModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(MapleModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(MapleStoryMod.TAB)));

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(MapleModBlocks.RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(MapleModBlocks.RUBY_ORE.get()));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven", () -> new BlockItemBase(MapleModBlocks.OVEN.get()));



}
