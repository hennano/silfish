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

	public BatteryItem(Properties properties) {
		super(properties);
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
		nbt.putInt("enelgy", this.getEnergy(stack) + volume);
	}


	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}


}
