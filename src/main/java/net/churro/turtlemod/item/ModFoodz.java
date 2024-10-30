package net.churro.turtlemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodz {
    public static final FoodProperties RAWTURTMEAT = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.3F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 0.3F)
            .meat()
            .build();

    public static final FoodProperties COOKEDTURTMEAT = (new FoodProperties.Builder())
            .nutrition(7)
            .saturationMod(0.6F)
            .meat()
            .build();

    public static final FoodProperties POTATOSQUARED = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(0.3F)
            .meat()
            .build();

    public static final FoodProperties BAKEDPOTATOSQUARED = (new FoodProperties.Builder())
            .nutrition(20)
            .saturationMod(0.3F)
            .build();

    public static final FoodProperties POISONOUSPOTATOSQUARED = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.3F)
            .effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 1)
            .build();

}
