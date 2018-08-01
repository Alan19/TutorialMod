package alan.tutorial.item;

import alan.tutorial.TutorialMod;
import alan.tutorial.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemCornSeed extends ItemSeeds {
    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("corn_seed");
        setRegistryName("corn_seed");
        setCreativeTab(TutorialMod.creativeTab);
    }

    public void registerItemModel(Item item) {
        TutorialMod.proxy.registerItemRenderer(item, 0, "corn_seed");
    }

}
