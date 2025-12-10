package dev.graeyamber.intreccio.datagen;

import dev.graeyamber.intreccio.Intreccio;
import dev.graeyamber.intreccio.registry.IntrBlockRegistry;
import dev.graeyamber.intreccio.registry.IntrItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class IntrItemModelProvider extends ItemModelProvider {
    public IntrItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Intreccio.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Block items generally use their corresponding block models as parent.
        ////withExistingParent(IntrBlockRegistry.SAPPHIRE_BLOCK.getId().toString(), modLoc("block/sapphire_block"));
        ////withExistingParent(IntrBlockRegistry.SAPPHIRE_DEEPSLATE_ORE.getId().toString(), modLoc("block/sapphire_deepslate_ore"));
        ////withExistingParent(IntrBlockRegistry.SAPPHIRE_ORE.getId().toString(), modLoc("block/sapphire_ore"));
        // Items generally use a simple parent and one texture. The most common parents are item/generated and item/handheld.
        // In this example, the item texture would be located at assets/examplemod/textures/item/example_item.png.
        // If you want a more complex model, you can use getBuilder() and then work from that, like you would with block models.
        withExistingParent(IntrItemRegistry.OLIVES.getId().toString(), mcLoc("item/generated")).texture("layer0", "item/olives");
        withExistingParent(IntrItemRegistry.OLIVE_OIL_BOTTLE.getId().toString(), mcLoc("item/generated")).texture("layer0", "item/olive_oil_bottle");
        withExistingParent(IntrItemRegistry.THATCH.getId().toString(), mcLoc("item/generated")).texture("layer0", "item/thatch");
        withExistingParent(IntrItemRegistry.SAPPHIRE.getId().toString(), mcLoc("item/generated")).texture("layer0", "item/sapphire");
        // The above line is so common that there is a shortcut for it. Note that the item registry name and the
        // texture path, relative to textures/item, must match.
        ////basicItem(IntrItemRegistry.OLIVES.get());
        ////basicItem(IntrItemRegistry.SAPPHIRE.get());
    }
}
