package alan.tutorial.recipes;

import alan.tutorial.block.ModBlocks;
import alan.tutorial.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);

        ModBlocks.oreCopper.initOreDict();
        ModItems.ingotCopper.initOreDict();
        ModItems.corn.initOreDict();
    }

}