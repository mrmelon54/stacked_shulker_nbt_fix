package com.mrmelon54.StackedShulkerNbtFix.forge;

import dev.architectury.platform.forge.EventBuses;
import com.mrmelon54.StackedShulkerNbtFix.StackedShulkerNbtFix;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StackedShulkerNbtFix.MOD_ID)
public class StackedShulkerNbtFixForge {
    public StackedShulkerNbtFixForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(StackedShulkerNbtFix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        StackedShulkerNbtFix.init();
    }
}
