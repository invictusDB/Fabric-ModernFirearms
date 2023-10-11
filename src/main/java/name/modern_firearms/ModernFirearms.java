package name.modern_firearms;

import name.modern_firearms.item.ModitemGroups;
import name.modern_firearms.item.Moditems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModernFirearms implements ModInitializer {
	//将mod_id（modernfirearms）变为常量
	public static final String MOD_ID = "modernfirearms";
	//初始化该mod
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//调用添加物品的方法
	@Override
	public void onInitialize() {
		ModitemGroups.registerItemGroups();
		Moditems.registerModItems();
	}
}