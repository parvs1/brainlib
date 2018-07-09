package org.brainstem.brainlib.optimizations;

import com.qualcomm.hardware.lynx.LynxEmbeddedIMU;
import com.qualcomm.hardware.lynx.LynxI2cColorRangeSensor;
import com.qualcomm.hardware.lynx.LynxI2cDeviceSynchV1;
import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.hardware.I2cDeviceSynch;

import org.firstinspires.ftc.robotcore.internal.system.AppUtil;

/**
 * Created by Parv on 2/4/2018.
 */

public class LynxOptimizedI2cSensorFactory
{
	public static LynxEmbeddedIMU createLynxBNO055IMU(LynxModule module, int bus)
	{
		return new LynxEmbeddedIMU(createLynxI2cDeviceSync(module, bus));
	}

	public static I2cDeviceSynch createLynxI2cDeviceSync(LynxModule module, int bus)
	{
		return new BetterI2cDeviceSynchImplOnSimple(
				new LynxI2cDeviceSynchV1(AppUtil.getDefContext(), module, bus), true);
	}

	public static LynxI2cColorRangeSensor createLynxI2cColorRangeSensor(LynxModule module, int bus)
	{
		return new LynxI2cColorRangeSensor(createLynxI2cDeviceSync(module, bus));
	}
}
