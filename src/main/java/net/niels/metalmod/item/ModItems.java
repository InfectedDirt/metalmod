package net.niels.metalmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.niels.metalmod.MetalMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MetalMod.MOD_ID);

    public static final RegistryObject<Item> VOID_STEEL_INGOT = ITEMS.register("void_steel_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.METALS_TAB)));
    public static final RegistryObject<Item> RAW_VOID_STEEL = ITEMS.register("raw_void_steel", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.METALS_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
