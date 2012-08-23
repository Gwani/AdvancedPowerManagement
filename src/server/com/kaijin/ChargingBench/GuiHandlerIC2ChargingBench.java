package com.kaijin.ChargingBench;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import com.kaijin.ChargingBench.*;

public class GuiHandlerIC2ChargingBench implements IGuiHandler
{

	@Override
	public Object getGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z)
	{
		if (!world.blockExists(x, y, z))
		{
			return null;
		}
		
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		return new ContainerChargingBench(player.inventory, (TileEntityChargingBench)tile);

	}
}
