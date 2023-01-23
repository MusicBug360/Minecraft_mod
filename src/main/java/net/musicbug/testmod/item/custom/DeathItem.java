package net.musicbug.testmod.item.custom;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DeathItem extends Item {
    public DeathItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            user.damage(DamageSource.GENERIC, 2147483646.0f);
            user.getItemCooldownManager().set(this, 100);
        }

        return super.use(world, user, hand);
    }
}
