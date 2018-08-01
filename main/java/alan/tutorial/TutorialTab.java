package alan.tutorial;

import alan.tutorial.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {
    public TutorialTab() {
        super(TutorialMod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }

    @Override
    public boolean hasSearchBar(){
        return true;
    }
}
