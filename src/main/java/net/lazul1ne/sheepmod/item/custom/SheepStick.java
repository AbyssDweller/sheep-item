package net.lazul1ne.sheepmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import net.minecraftforge.common.ForgeSpawnEggItem;

import static net.minecraft.client.renderer.texture.MissingTextureAtlasSprite.getLocation;

public class SheepStick extends Item {
    public SheepStick(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            EntityType.SHEEP.spawn((ServerLevel) level, null, null, player.blockPosition(), MobSpawnType.COMMAND, true, false);
        }

        return super.use(level, player, hand);
    }

}

