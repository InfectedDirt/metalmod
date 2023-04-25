package net.niels.metalmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab METALS_TAB = new CreativeModeTab("metals") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOID_STEEL_INGOT.get());
        }
    };
}
