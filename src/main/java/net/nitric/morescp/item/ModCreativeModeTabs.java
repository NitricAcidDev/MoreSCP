package net.nitric.morescp.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nitric.morescp.MoreSCP;
import net.nitric.morescp.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreSCP.MODID);

    public static final RegistryObject<CreativeModeTab> MORE_SCP_TAB = CREATIVE_MODE_TABS.register("more_scp_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.SCIENCE_ZONE_CONCRETE_STRIPED.get()))
                    .title(Component.translatable("creativetab.more_scp_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SCIENCE_ZONE_CONCRETE_BORDER.get());
                        output.accept(ModBlocks.SCIENCE_ZONE_CONCRETE.get());
                        output.accept(ModBlocks.SCIENCE_ZONE_CONCRETE_STRIPED.get());
                        output.accept(ModBlocks.TRAINING_ZONE_CONCRETE_BORDER.get());
                        output.accept(ModBlocks.TRAINING_ZONE_CONCRETE.get());
                        output.accept(ModBlocks.TRAINING_ZONE_CONCRETE_STRIPED.get());
                        output.accept(ModBlocks.HOME_ZONE_CONCRETE_BORDER.get());
                        output.accept(ModBlocks.HOME_ZONE_CONCRETE.get());
                        output.accept(ModBlocks.HOME_ZONE_CONCRETE_STRIPED.get());
                        output.accept(ModBlocks.VENDING_MACHINE.get());
                        output.accept(ModBlocks.CONTAINMENT_SIGN_173.get());
                        output.accept(ModBlocks.CONTAINMENT_SIGN_096.get());
                        output.accept(ModBlocks.CONTAINMENT_SIGN_999.get());
                        output.accept(ModBlocks.CONTAINMENT_SIGN_106.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
