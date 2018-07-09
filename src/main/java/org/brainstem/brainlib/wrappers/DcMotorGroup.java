package org.brainstem.brainlib.wrappers;

import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The class DC motor group.
 */
public class DcMotorGroup
{
	/**
	 * The grouped motors.
	 */
	private List<DcMotor> motors = new ArrayList<>();

	public DcMotorGroup(DcMotor... dcMotors)
	{
		Collections.addAll(motors, dcMotors);
	}

	/**
	 * Sets power to each motor in the group.
	 *
	 * @param power desired power to set to each motor
	 */
	public void setPower(double power)
	{
		for (DcMotor motor : motors)
			motor.setPower(power);
	}

	public void setRunMode(DcMotor.RunMode runMode)
	{
		for (DcMotor motor : motors)
			motor.setMode(runMode);
	}

	public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior zeroPowerBehavior)
	{
		for (DcMotor motor : motors)
			motor.setZeroPowerBehavior(zeroPowerBehavior);
	}

	/**
	 * Stops motors in the group.
	 */
	public void stop()
	{
		for (DcMotor motor : motors)
			motor.setPower(0);
	}
}
