package modtutorial.modtutorial.block;

import modtutorial.modtutorial.Modtutorial;
import modtutorial.modtutorial.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Modtutorial.MODID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){ RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn); return toReturn; }

    public static final RegistryObject<Block> VOID_STONE = registerBlock("void_stone", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(10f).lightLevel((state) -> 10)));

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){ return Moditems.ITEMS.register(name,
            () -> new BlockItem(block.get(), new Item.Properties())); }

    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
