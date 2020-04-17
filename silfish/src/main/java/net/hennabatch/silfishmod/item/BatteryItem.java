package net.hennabatch.silfishmod.item;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BatteryItem extends Item{

	private final EnumBatteryType batteryType;

	public BatteryItem(EnumBatteryType type,Properties properties) {
		super(properties);
		this.batteryType = type;
	}

	//容量の取得
	public int getCapacity(ItemStack stack) {
		return this.batteryType.getCapacity();
	}

	//エネルギー量の取得
	public int getEnergy(ItemStack stack) {
		CompoundNBT nbt = stack.getTag();
		return nbt == null ? 0: nbt.getInt("enelgy");
	}

	//エネルギー量の設定
	public void setEnergy(ItemStack stack, int volume) {
		CompoundNBT nbt = stack.getTag();
		if(nbt == null) {
			nbt = new CompoundNBT();
		}
		nbt.putInt("enelgy", Math.min(this.getEnergy(stack) + volume, this.getCapacity(stack)));
	}


	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}


}
