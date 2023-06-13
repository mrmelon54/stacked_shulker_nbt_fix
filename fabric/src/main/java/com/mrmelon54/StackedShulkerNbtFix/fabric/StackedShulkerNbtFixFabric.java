package com.mrmelon54.StackedShulkerNbtFix.fabric;

import com.mrmelon54.StackedShulkerNbtFix.fabriclike.StackedShulkerNbtFixFabricLike;
import net.fabricmc.api.ModInitializer;

public class StackedShulkerNbtFixFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StackedShulkerNbtFixFabricLike.init();
    }
}
