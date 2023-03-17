package net.musicbug.testmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.util.math.random.Random;

public class ModFoodComponents {
    public static final FoodComponent DREAM_FRUIT = new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, Random.createLocal().nextInt(254)), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, Random.createLocal().nextInt(2)), .5f).build();
    public static final FoodComponent SWEET_BERRY_PIE = new FoodComponent.Builder().hunger(7).saturationModifier(1.4f).build();
}
