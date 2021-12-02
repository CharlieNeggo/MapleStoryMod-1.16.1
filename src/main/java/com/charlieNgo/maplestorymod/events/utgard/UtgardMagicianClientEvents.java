package com.charlieNgo.maplestorymod.events.utgard;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleUtgardSetItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class UtgardMagicianClientEvents {

    @SubscribeEvent
    public static void onDamageEntityFan(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleUtgardSetItems.UTGARD_FAN.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.BLUE + "...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    public static void onDamageEntityShiningRod(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleUtgardSetItems.UTGARD_SHINING_ROD.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.BLUE + "...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
    public static void onDamageEntityStaff(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleUtgardSetItems.UTGARD_STAFF.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.BLUE + "...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
    public static void onDamageEntityShiningStick(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleUtgardSetItems.UTGARD_SHINING_STICK.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.BLUE + "...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
    public static void onDamageEntityWand(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleUtgardSetItems.UTGARD_WAND.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.BLUE + "...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
    public static void onDamageEntityPsy(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleUtgardSetItems.UTGARD_PSY.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.BLUE + "...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
}
