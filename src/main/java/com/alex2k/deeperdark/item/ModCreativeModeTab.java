package com.alex2k.deeperdark.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab DEEPER_DARK_TAB = new CreativeModeTab("deeper_dark_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.SCULK_CRYSTAL.get());
        }
    };
}
