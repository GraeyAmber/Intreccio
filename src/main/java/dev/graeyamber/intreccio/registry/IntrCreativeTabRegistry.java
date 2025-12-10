package dev.graeyamber.intreccio.registry;

import dev.graeyamber.intreccio.Intreccio;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IntrCreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Intreccio.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INTRECCIO_TAB = CREATIVE_MODE_TABS.register("intreccio_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.intreccio")).withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> IntrItemRegistry.OLIVES.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(IntrItemRegistry.OLIVES.get());
        output.accept(IntrItemRegistry.OLIVE_OIL_BOTTLE.get());
        output.accept(IntrItemRegistry.THATCH.get());
        output.accept(IntrItemRegistry.SAPPHIRE.get());

        output.accept(IntrBlockRegistry.SAPPHIRE_BLOCK.asItem());
        output.accept(IntrBlockRegistry.SAPPHIRE_DEEPSLATE_ORE.asItem());
        output.accept(IntrBlockRegistry.SAPPHIRE_ORE.asItem());
    }).build());
}
