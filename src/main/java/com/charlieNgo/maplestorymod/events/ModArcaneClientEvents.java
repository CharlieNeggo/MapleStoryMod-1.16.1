package com.charlieNgo.maplestorymod.events;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleArcaneSetItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModArcaneClientEvents {

    @SubscribeEvent
    public static void onDamageEntityArcaneAxe(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleArcaneSetItems.ARCANE_POLEARM.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
                    target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 10*30));
                    target.addPotionEffect(new EffectInstance(Effects.WITHER, 10*30));


                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.RED + "Weakened and Slowed...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onDamageEntityArcaneTwoHandedSword(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleArcaneSetItems.ARCANE_TWOHANDED_SWORD.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));


                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.RED + "Slowed...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onDamageEntityArcaneDagger(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleArcaneSetItems.ARCANE_DAGGER.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.DARK_PURPLE + "Poisoned and Slowed...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onDamageEntityArcaneKatara(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleArcaneSetItems.ARCANE_KATARA.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.DARK_PURPLE + "Poisoned and Slowed...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
}
