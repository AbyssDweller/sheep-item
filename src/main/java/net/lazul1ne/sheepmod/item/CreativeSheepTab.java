package net.lazul1ne.sheepmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeSheepTab {
    public static final CreativeModeTab SHEEP_TAB = new CreativeModeTab("sheeptab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.sheep_stick.get());
        }
    };
}
