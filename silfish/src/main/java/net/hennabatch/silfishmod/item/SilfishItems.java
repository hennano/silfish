package net.hennabatch.silfishmod.item;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import net.hennabatch.silfishmod.util.ModUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SilfishItems {

	//materials
	public static final Item BATTERY = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(ModUtils.location("battery"));

	//tool
	public static final Item CAPTURE_GUN = new CaptureGunItem(new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(ModUtils.location("capture_gun"));








	public static List<Item> getItems(){
		List<Item> items = new ArrayList<Item>();
		for(Field field: SilfishItems.class.getFields()) {
			Item item;
			try {
				item = (Item) field.get(null);
				items.add(item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return items;
	}

	public static Item[] register() {
		return getItems().stream().toArray(x -> new Item[x]);
	}
}
