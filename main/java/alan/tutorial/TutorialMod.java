package alan.tutorial;

import alan.tutorial.block.ModBlocks;
import alan.tutorial.item.ModItems;
import alan.tutorial.proxy.CommonProxy;
import alan.tutorial.recipes.ModRecipes;
import alan.tutorial.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version)
public class TutorialMod {

    public static final String modId = "tutorial";
    public static final String name = "Tutorial Mod";
    public static final String version = "1.0.0";
    public static final TutorialTab creativeTab = new TutorialTab();
    @SidedProxy(serverSide = "alan.tutorial.proxy.CommonProxy", clientSide = "alan.tutorial.proxy.ClientProxy")
    public static CommonProxy proxy;
    @Mod.Instance(modId)
    public static TutorialMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event){
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }
}
