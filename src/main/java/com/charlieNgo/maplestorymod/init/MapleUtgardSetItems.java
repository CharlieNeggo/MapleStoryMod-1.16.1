package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.MapleModItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MapleUtgardSetItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<AxeItem> UTGARD_POLEARM = ITEMS.register("utgard_polearm", () -> new AxeItem(MapleModItemTier.RUBY, 11, -3.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> UTGARD_TWOHANDED_SWORD = ITEMS.register("utgard_twohanded_sword", () -> new SwordItem(MapleModItemTier.RUBY, 11, -2.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> UTGARD_DAGGER = ITEMS.register("utgard_dagger", () -> new SwordItem(MapleModItemTier.RUBY, 11, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<SwordItem> UTGARD_KATARA = ITEMS.register("utgard_katara", () -> new SwordItem(MapleModItemTier.RUBY, 6, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));
}
