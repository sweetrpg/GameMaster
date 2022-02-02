package com.sweetrpg.minecraft.gamemaster.setup;
import com.sweetrpg.minecraft.gamemaster.Constants;
import com.sweetrpg.minecraft.gamemaster.GameMaster;
import com.sweetrpg.minecraft.gamemaster.network.Networking;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static com.sweetrpg.minecraft.gamemaster.GameMaster.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final CreativeModeTab GAMEMASTER_TAB = new CreativeModeTab(Constants.GAMEMASTER_TAB_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(Registration.SCEPTER_ITEM.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {
        Networking.registerMessages();

//        MinecraftForge.EVENT_BUS.addGenericListener(Entity.class, ChargeEventHandler::onAttachCapabilitiesEvent);
//        MinecraftForge.EVENT_BUS.addListener(ChargeEventHandler::onAttackEvent);
//        MinecraftForge.EVENT_BUS.addListener(ChargeEventHandler::onDeathEvent);

        event.enqueueWork(() -> {
//            Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(MyTutorial.MODID, "chunkgen"),
//                    TutorialChunkGenerator.CODEC);
//            Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(MyTutorial.MODID, "biomes"),
//                    TutorialBiomeProvider.CODEC);
        });
    }

    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
//        event.put(Registration.WEIRDMOB.get(), WeirdMobEntity.prepareAttributes().build());
    }

    @SubscribeEvent
    public static void serverLoad(RegisterCommandsEvent event) {
//        ModCommands.register(event.getDispatcher());
    }

    @SubscribeEvent
    public void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
//        event.register(IEntityCharge.class);
    }

}