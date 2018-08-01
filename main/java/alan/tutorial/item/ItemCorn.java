package alan.tutorial.item;

import alan.tutorial.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCorn extends ItemFood {
    public ItemCorn() {
        super(3, 0.6f, false);
        setUnlocalizedName("corn");
        setRegistryName("corn");
        setCreativeTab(TutorialMod.creativeTab);
    }

    public void registerItemModel(Item item) {
        TutorialMod.proxy.registerItemRenderer(this, 0, "corn");
    }

    public void initOreDict() {
        OreDictionary.registerOre("cropCorn", this);
    }
}
