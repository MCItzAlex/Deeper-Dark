package com.alex2k.deeperdark.item;

import com.alex2k.deeperdark.DeeperDark;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeeperDark.MOD_ID);

    // SCULK CRYSTAL
    public static final RegistryObject<Item> SCULK_CRYSTAL = ITEMS.register("sculk_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DEEPER_DARK_TAB).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
