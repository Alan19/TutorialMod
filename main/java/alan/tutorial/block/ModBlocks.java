package alan.tutorial.block;

import alan.tutorial.block.counter.BlockCounter;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper");

    public static BlockCropCorn cropCorn = new BlockCropCorn();

    public static BlockPedestal pedestal = new BlockPedestal();

    public static BlockCounter counter = new BlockCounter();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(oreCopper, cropCorn, counter);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(oreCopper.createItemBlock(), counter.createItemBlock());
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        counter.registerItemModel(Item.getItemFromBlock(counter));
    }

}
