package alan.tutorial.block;

import alan.tutorial.TutorialMod;
import alan.tutorial.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops {
    public BlockCropCorn() {
        setUnlocalizedName("crop_corn");
        setRegistryName("crop_corn");
        setCreativeTab(TutorialMod.creativeTab);
    }

    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }
}
