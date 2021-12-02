package net.mikeyypants.testmod.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> RAW_SILVER = Registration.ITEMS.register("raw_silver", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    static void register() {}
}
