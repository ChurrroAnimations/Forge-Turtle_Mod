package net.churro.turtlemod.item;

import net.churro.turtlemod.TurtleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TurtleMod.MOD_ID);

    // items in da mod
    public static final RegistryObject<Item> POTATOSQUARED = ITEMS.register(
            "potatosquared",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BAKEDPOTATOSQUARED = ITEMS.register(
            "baked_potatosquared",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> POISONOUSPOTATOSQUARED = ITEMS.register(
            "poisonous_potatosquared",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> TORTOISESCUTE = ITEMS.register(
            "tortoise_scute",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
