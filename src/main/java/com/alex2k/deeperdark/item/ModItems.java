package com.alex2k.deeperdark.item;

import com.alex2k.deeperdark.DeeperDark;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
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

    // WARDEN HEART
    public static final RegistryObject<Item> WARDEN_HEART = ITEMS.register("warden_heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DEEPER_DARK_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    // WARDEN ARMOUR
    public static final RegistryObject<Item> WARDEN_HELMET = ITEMS.register("warden_helmet",
            () -> new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.HEAD,
                new Item.Properties().tab(ModCreativeModeTab.DEEPER_DARK_TAB)));

    public static final RegistryObject<Item> WARDEN_CHESTPLATE = ITEMS.register("warden_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.DEEPER_DARK_TAB)));

    public static final RegistryObject<Item> WARDEN_LEGGINGS = ITEMS.register("warden_leggings",
            () -> new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.DEEPER_DARK_TAB)));

    public static final RegistryObject<Item> WARDEN_BOOTS = ITEMS.register("warden_boots",
            () -> new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.DEEPER_DARK_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
