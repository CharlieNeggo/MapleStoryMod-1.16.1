package com.charlieNgo.rubyoremod.util;

import com.charlieNgo.rubyoremod.RubyOreMod;
import com.charlieNgo.rubyoremod.armor.ModArmorMaterial;
import com.charlieNgo.rubyoremod.blocks.BlockItemBase;
import com.charlieNgo.rubyoremod.blocks.RubyBlock;
import com.charlieNgo.rubyoremod.items.Amongus;
import com.charlieNgo.rubyoremod.items.ItemBase;
import com.charlieNgo.rubyoremod.items.Poop;
import com.charlieNgo.rubyoremod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RubyOreMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RubyOreMod.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Poop> POOP = ITEMS.register("poop", Poop::new);
    public static final RegistryObject<Amongus> AMONGUS = ITEMS.register("amongus", Amongus::new);

    // Tools
    // Sword
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 6, -1.5F
    , new Item.Properties().group(RubyOreMod.TAB)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 4, -1.7F
            , new Item.Properties().group(RubyOreMod.TAB)));
    //Axe
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 8, -2.0F
            , new Item.Properties().group(RubyOreMod.TAB)));
    //Shovel
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 3, -1.9F
            , new Item.Properties().group(RubyOreMod.TAB)));
    //Hoe
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -1.1F
            , new Item.Properties().group(RubyOreMod.TAB)));

    //Armor
    //Helmet
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(RubyOreMod.TAB)));
    //Chest Plate
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(RubyOreMod.TAB)));
    //Leggings
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(RubyOreMod.TAB)));
    //Boots
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(RubyOreMod.TAB)));

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
}
