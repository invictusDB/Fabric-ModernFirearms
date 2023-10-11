package name.modern_firearms.item;

import name.modern_firearms.ModernFirearms;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModitemGroups {
    //该方法为自定义物品标签栏
    public static final ItemGroup MODDERNFIREARMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ModernFirearms.MOD_ID,"modernfirearms"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modernfirearms"))//这指的是物品栏标签页的名称
                    //下方代码表示标签页所使用的图标的地址和Moditems.MODDERNFIREARMS_ALLOY为同一个
                    .icon(()->new ItemStack(Moditems.MODDERNFIREARMS_ALLOY)).entries((displayContext, entries) -> {
                        //在此大括号内添加该标签页内所要显示的物品
                        entries.add(Moditems.MODDERNFIREARMS_ALLOY);
                        entries.add(Moditems.MODDERNFIREARMS_REW_ALLOY);

                    }
            ).build());
    public static void registerItemGroups() {
        ModernFirearms.LOGGER.info("Registering Item Groups for " + ModernFirearms.MOD_ID);
    }
}
