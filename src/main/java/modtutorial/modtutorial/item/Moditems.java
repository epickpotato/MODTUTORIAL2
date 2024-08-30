package modtutorial.modtutorial.item;

import modtutorial.modtutorial.Modtutorial;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Modtutorial.MODID);

    public static final RegistryObject<Item> POTATO=
            ITEMS.register("potato", () -> new Item(
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build())));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

