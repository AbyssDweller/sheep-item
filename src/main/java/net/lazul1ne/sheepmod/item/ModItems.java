
package net.lazul1ne.sheepmod.item;

        import net.lazul1ne.sheepmod.SheepMod;
        import net.minecraft.world.item.Item;
        import net.minecraftforge.eventbus.api.IEventBus;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.registries.ForgeRegistries;
        import net.minecraftforge.registries.RegistryObject;
        import net.lazul1ne.sheepmod.item.custom.SheepStick;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SheepMod.MOD_ID);

    public static final RegistryObject<Item> sheep_stick = ITEMS.register("sheep_stick",
            () -> new SheepStick(new Item.Properties().tab(CreativeSheepTab.SHEEP_TAB)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
