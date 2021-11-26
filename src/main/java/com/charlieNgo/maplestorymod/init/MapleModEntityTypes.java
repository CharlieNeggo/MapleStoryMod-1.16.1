package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.MushRoom;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MapleModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,MapleStoryMod.MOD_ID);

    public static final RegistryObject<EntityType<MushRoom>> MUSHROOM = ENTITY_TYPES.register("mushroom", () -> EntityType.Builder.create(MushRoom::new
    , EntityClassification.CREATURE)
            .size(1.0f, 1.0f)
            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "mushroom").toString()));
}
