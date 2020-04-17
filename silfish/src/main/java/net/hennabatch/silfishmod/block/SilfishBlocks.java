package net.hennabatch.silfishmod.block;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import net.hennabatch.silfishmod.item.SilfishItems;
import net.minecraft.block.Block;

public class SilfishBlocks {

	public static List<Block> getBlocks(){
		List<Block> blocks = new ArrayList<Block>();
		for(Field field: SilfishItems.class.getFields()) {
			Block brock;
			try {
				brock = (Block) field.get(null);
				blocks.add(brock);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return blocks;
	}

	public static Block[] register() {
		return getBlocks().stream().toArray(x -> new Block[x]);
	}

}
