package org.brainstem.brainlib.optimizations;

import com.qualcomm.robotcore.hardware.I2cDeviceSynch;
import com.qualcomm.robotcore.hardware.I2cDeviceSynchImplOnSimple;
import com.qualcomm.robotcore.hardware.I2cDeviceSynchSimple;

/**
 * Created by Parv on 2/4/2018.
 */

public class BetterI2cDeviceSynchImplOnSimple extends I2cDeviceSynchImplOnSimple
{
	public BetterI2cDeviceSynchImplOnSimple(I2cDeviceSynchSimple simple, boolean isSimpleOwned)
	{
		super(simple, isSimpleOwned);
	}

	@Override
	public void setReadWindow(I2cDeviceSynch.ReadWindow window)
	{
		// Intentionally do nothing
	}
}