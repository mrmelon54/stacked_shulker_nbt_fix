package com.mrmelon54.StackedShulkerNbtFix;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.PlayerEvent;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class StackedShulkerNbtFix {
    public static final String MOD_ID = "stacked_shulker_nbt_fix";

    public static Item[] SHULKERS = new Item[]{
            Items.SHULKER_BOX,
            Items.WHITE_SHULKER_BOX,
            Items.ORANGE_SHULKER_BOX,
            Items.MAGENTA_SHULKER_BOX,
            Items.LIGHT_BLUE_SHULKER_BOX,
            Items.YELLOW_SHULKER_BOX,
            Items.LIME_SHULKER_BOX,
            Items.PINK_SHULKER_BOX,
            Items.GRAY_SHULKER_BOX,
            Items.LIGHT_GRAY_SHULKER_BOX,
            Items.CYAN_SHULKER_BOX,
            Items.PURPLE_SHULKER_BOX,
            Items.BLUE_SHULKER_BOX,
            Items.BROWN_SHULKER_BOX,
            Items.GREEN_SHULKER_BOX,
            Items.RED_SHULKER_BOX,
            Items.BLACK_SHULKER_BOX,
    };

    public static void init() {
        PlayerEvent.PICKUP_ITEM_PRE.register((player, entity, stack) -> {
            for (Item shulker : SHULKERS) {
                if (!stack.is(shulker)) continue;

                // get nbt tag
                CompoundTag orCreateTag = stack.getOrCreateTag();

                // get block entity tag
                if (!orCreateTag.contains("BlockEntityTag", 10)) continue;
                CompoundTag blockEntityTag = orCreateTag.getCompound("BlockEntityTag");

                // get items list
                if (!blockEntityTag.contains("Items", 9)) continue;
                ListTag items = blockEntityTag.getList("Items", 10);

                // if there are no items then remove it
                if (items.size() != 0) continue;

                orCreateTag.remove("BlockEntityTag");
                stack.setTag(orCreateTag);
                entity.setItem(stack);
            }
            return EventResult.pass();
        });
    }
}
