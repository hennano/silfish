package net.hennabatch.silfishmod.item;

public enum EnumBatteryType {

	SMALL(1000),
	MEDIAM(5000),
	LARGE(20000),
	INFINITY(Integer.MAX_VALUE);

	private final int capacity;

	private EnumBatteryType(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

}