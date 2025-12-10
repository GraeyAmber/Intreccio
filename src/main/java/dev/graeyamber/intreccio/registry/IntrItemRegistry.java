package dev.graeyamber.intreccio.registry;

import dev.graeyamber.intreccio.Intreccio;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IntrItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Intreccio.MOD_ID);

    public static final DeferredItem<Item> OLIVES = ITEMS.registerSimpleItem("olives", new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(1).saturationModifier(2f).build()));
    public static final DeferredItem<Item> OLIVE_OIL_BOTTLE = ITEMS.registerSimpleItem("olive_oil_bottle", new Item.Properties());
    public static final DeferredItem<Item> THATCH = ITEMS.registerSimpleItem("thatch", new Item.Properties());
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.registerSimpleItem("sapphire", new Item.Properties());

}
