package alan.tutorial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
    public static ItemCornSeed cornSeed = new ItemCornSeed();
    public static ItemCorn corn = new ItemCorn();

    public static void register(IForgeRegistry<Item> registry){
        registry.registerAll(ingotCopper, corn, cornSeed);
    }
    public static void registerModels(){
        ingotCopper.registerItemModel();
        corn.registerItemModel(corn);
        cornSeed.registerItemModel(cornSeed);
    }
}
