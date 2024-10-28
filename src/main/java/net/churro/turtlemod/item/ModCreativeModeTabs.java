package net.churro.turtlemod.item;

import net.churro.turtlemod.TurtleMod;
import net.churro.turtlemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVEMODETABZ =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TurtleMod.MOD_ID);

    // creative inventory tabs in da mod
    public static final RegistryObject<CreativeModeTab> TURTLESHANIGANS =
            CREATIVEMODETABZ.register(
                    "turtley_awesome_tab",
                    () -> CreativeModeTab.builder()
                            .icon(
                                    () -> new ItemStack(Items.SCUTE)
                            )
                            .title(
                                    Component.translatable("tutletab.turtley_awesome_tab")
                            )
                            .displayItems(
                                    (pParameters, pOutput) -> {
                                        // items in da creative inventory tab in da mod
                                        pOutput.accept(Items.SCUTE);
                                        pOutput.accept(ModBlocks.TURTLESCUTEBLOCK.get());
                                        pOutput.accept(ModBlocks.TURTLESCUTEBRICKS.get());
                                        pOutput.accept(ModItems.TORTOISESCUTE.get());
                                        pOutput.accept(ModBlocks.TORTOISESCUTEBLOCK.get());
                                        pOutput.accept(ModBlocks.TORTOISESCUTEBRICKS.get());
                                    }
                            )
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVEMODETABZ.register(eventBus);
    }
}