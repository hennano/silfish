package net.hennabatch.silfishmod.item;

public enum EnumBatteryType {

	SMALL(100),
	MEDIAM(500),
	LARGE(2000),
	INFINITY(Integer.MAX_VALUE);

	private final int capacity;

	private EnumBatteryType(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

}