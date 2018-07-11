package org.brainstem.brainlib.wrappers;

import com.qualcomm.hardware.bosch.BNO055IMU;

import org.brainstem.brainlib.localization.Angle;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.Quaternion;

import java.util.Locale;

/**
 * The type Adafruit imu.
 */
public class BrainImu
{
	private BNO055IMU imu;
	private double zeroPosition;

	/**
	 * Instantiates a new Adafruit imu quaternion.
	 *
	 * @param imu the imu
	 */
	public BrainImu(BNO055IMU imu)
	{
		this.imu = imu;

		BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();

		parameters.mode = BNO055IMU.SensorMode.IMU;
		parameters.useExternalCrystal = true;
		parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;

		imu.initialize(parameters);
	}

	public double getHeading()
	{
		Orientation angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
		return (-angles.firstAngle + 360 - zeroPosition) % 360;
	}

	/**
	 * Gets error.
	 *
	 * @param targetAngle the target angle
	 * @return the error
	 */
	public double getError(double targetAngle)
	{
		double angleError;

		angleError = (targetAngle - getHeading());
		angleError = Angle.normalize(angleError);

		return angleError;
	}

	/**
	 * Sets zero position.
	 */
	public void setZeroPosition()
	{
		zeroPosition = getCurrentAbsoluteHeading();
	}

	private double getCurrentAbsoluteHeading()
	{
		Orientation angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
		return (-angles.firstAngle + 360) % 360;
	}
}