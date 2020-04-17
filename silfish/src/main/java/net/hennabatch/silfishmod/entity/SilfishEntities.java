package net.hennabatch.silfishmod.entity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EntityType;

public class SilfishEntities {


	public static List<EntityType<?>> getEntities(){
		List<EntityType<?>> entities = new ArrayList<EntityType<?>>();
		for(Field field: SilfishEntities.class.getFields()) {
			EntityType<?> entity;
			try {
				entity = (EntityType<?>) field.get(null);
				entities.add(entity);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return entities;
	}

	public static EntityType<?>[] register() {
		return getEntities().stream().toArray(x -> new EntityType<?>[x]);
	}

}
