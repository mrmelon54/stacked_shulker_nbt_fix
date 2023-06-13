package com.mrmelon54.StackedShulkerNbtFix.quilt;

import com.mrmelon54.StackedShulkerNbtFix.fabriclike.StackedShulkerNbtFixFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class StackedShulkerNbtFixQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        StackedShulkerNbtFixFabricLike.init();
    }
}
