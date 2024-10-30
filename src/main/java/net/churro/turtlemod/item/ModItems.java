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
            () -> new Item(new Item
                    .Properties()
            )
    );
    public static final RegistryObject<Item> BAKEDPOTATOSQUARED = ITEMS.register(
            "baked_potatosquared",
            () -> new Item(new Item
                    .Properties()
            )
    );
    public static final RegistryObject<Item> POISONOUSPOTATOSQUARED = ITEMS.register(
            "poisonous_potatosquared",
            () -> new Item(new Item
                    .Properties()
            )
    );
    public static final RegistryObject<Item> TORTOISESCUTE = ITEMS.register(
            "tortoise_scute",
            () -> new Item(new Item
                    .Properties()
            )
    );
    public static final RegistryObject<Item> STAFFDEOWO = ITEMS.register(
            "staff_of_owo",
            () -> new StaffOfOwO(new Item
                    .Properties()
                    .durability(69)
            )
    );
    public static final RegistryObject<Item> RAWTURTMEAT = ITEMS.register(
            "raw_turtle_meat",
            () -> new Item(new Item
                    .Properties()
                    .food(ModFoodz.RAWTURTMEAT)
            )
    );
    public static final RegistryObject<Item> COOKEDTURTMEAT = ITEMS.register(
            "cooked_turtle_meat",
            () -> new Item(new Item
                    .Properties()
                    .food(ModFoodz.COOKEDTURTMEAT)
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
