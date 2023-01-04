package net.musicbug.testmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KillBlock extends Block {
    public KillBlock(Settings settings) {
        super(settings);
    }

    /*@Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                              Hand hand, BlockHitResult hit) {

        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            player.sendMessage(Text.literal("Speed and Jump Boost have been given."));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 60));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60));

        }

        return super.onUse(state, world, pos, player, hand, hit);
    }*/

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            entity.damage(DamageSource.HOT_FLOOR, 20.0f);
        }

        super.onSteppedOn(world, pos, state, entity);

    }
}
