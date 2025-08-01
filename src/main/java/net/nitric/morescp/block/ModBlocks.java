package net.nitric.morescp.block;

import net.minecraft.server.commands.BanListCommands;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nitric.morescp.MoreSCP;
import net.nitric.morescp.item.ModItems;
import net.nitric.morescp.block.custom.VendingMachineBlock;
import net.nitric.morescp.block.custom.ContainmentSignBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreSCP.MODID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final RegistryObject<Block> SCIENCE_ZONE_CONCRETE_BORDER = registerBlock("science_zone_concrete_border",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SCIENCE_ZONE_CONCRETE= registerBlock("science_zone_concrete",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SCIENCE_ZONE_CONCRETE_STRIPED = registerBlock("science_zone_concrete_striped",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> TRAINING_ZONE_CONCRETE_BORDER = registerBlock("training_zone_concrete_border",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> TRAINING_ZONE_CONCRETE= registerBlock("training_zone_concrete",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> TRAINING_ZONE_CONCRETE_STRIPED = registerBlock("training_zone_concrete_striped",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> HOME_ZONE_CONCRETE_BORDER = registerBlock("home_zone_concrete_border",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> HOME_ZONE_CONCRETE= registerBlock("home_zone_concrete",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> HOME_ZONE_CONCRETE_STRIPED = registerBlock("home_zone_concrete_striped",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> VENDING_MACHINE = registerBlock("vending_machine",
            VendingMachineBlock::new);
    public static final RegistryObject<Block> CONTAINMENT_SIGN_173 = registerBlock("containment_sign_173",
            () -> new ContainmentSignBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CONTAINMENT_SIGN_096 = registerBlock("containment_sign_096",
            () -> new ContainmentSignBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CONTAINMENT_SIGN_999 = registerBlock("containment_sign_999",
            () -> new ContainmentSignBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CONTAINMENT_SIGN_106 = registerBlock("containment_sign_106",
            () -> new ContainmentSignBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}

