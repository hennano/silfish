package net.hennabatch.silfishmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hennabatch.silfishmod.item.SilfishItems;
import net.hennabatch.silfishmod.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.modid)
public class SilfishMod {
	public static SilfishMod instance;
	public static final Logger logger = LogManager.getLogger(Reference.modid);

	public SilfishMod() {
		instance = this;

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

		MinecraftForge.EVENT_BUS.register(this);
	}

    private void setup(final FMLCommonSetupEvent event){
        // some preinit code
    }

    private void clientRegistries(final FMLCommonSetupEvent event) {
    	// some client registry code
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents{

    	@SubscribeEvent
    	public static void registerItems(final RegistryEvent.Register<Item> event) {
    		event.getRegistry().registerAll(SilfishItems.register());
    		logger.info("Item registred.");
    	}
    	/*
    	@SubscribeEvent
    	public static void registerBlocks(final RegistryEvent.Register<Block> event) {

    		event.getRegistry().registerAll(ElebitsBlocks.register());
    		logger.info("Block registred.");
    	}
    	*/
    	/*
    	@SubscribeEvent
    	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
    		event.getRegistry().registerAll(ElebitsEntities.register());
    		logger.info("Entity registred.");
    	}
    	*/
    }
}