package net.dimidium.aboe.item;

import net.dimidium.aboe.block.portal.thevoid.VoidPortal;
import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.worldgen.dimension.ABOEDimensions;
import net.dimidium.dimidiumcore.api.item.ItemBase;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class VoidKey extends ItemBase implements IItemTab
{
    public VoidKey()
    {
        super(1,false, false, false, false);
    }

    @Override
    public int getMaxDamage(ItemStack stack)
    {
        return 1;
    }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        if(context.getPlayer() != null)
        {
            if(context.getPlayer().level().dimension() == ABOEDimensions.THE_VOID_LEVEL_KEY || context.getPlayer().level().dimension() == Level.OVERWORLD)
            {
                for(Direction direction : Direction.Plane.VERTICAL)
                {
                    BlockPos framePos = context.getClickedPos().relative(direction);

                    if(((VoidPortal) BlockRegistry.VOID_PORTAL.get()).trySpawnPortal(context.getLevel(), framePos))
                    {
                        context.getLevel().playSound(context.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.CONSUME;
                    }

                    else
                    {
                        return InteractionResult.FAIL;
                    }
                }
            }
        }

        return InteractionResult.FAIL;
    }
}