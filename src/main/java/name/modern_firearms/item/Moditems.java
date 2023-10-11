package name.modern_firearms.item;

import name.modern_firearms.ModernFirearms;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    //此方法为构造物品
    public static final Item MODDERNFIREARMS_ALLOY = registerItem("modernfirearms_alloy",new Item(new FabricItemSettings()));
    public static final Item MODDERNFIREARMS_REW_ALLOY = registerItem("modernfirearms_rew_alloy",new Item(new FabricItemSettings()));
    //此方法往创造模式列表添加物品
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MODDERNFIREARMS_ALLOY);
        entries.add(MODDERNFIREARMS_REW_ALLOY);
    }
    //此方法为增加该物品列表
    private static Item registerItem (String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(ModernFirearms.MOD_ID,name),item);
    }
    //此用法往mod中添加该物品
    public static void registerModItems(){
        ModernFirearms.LOGGER.info("Registering Mod Item for "+ ModernFirearms.MOD_ID);
        //把物品往物品标签页中添加，如：ItemGroups.INGREDIENTS 是往标签页中的原材料一栏加入上方添加的物品
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientItemGroup);
    }
}
