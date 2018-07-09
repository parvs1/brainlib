package org.brainstem.brainlib.wrappers;

import com.qualcomm.robotcore.hardware.AnalogInput;


public class FlexSensor
{
	private double scalingFactor;

	private AnalogInput flexSensor;

	/**
	 * Instantiates a new Maxbotix ultrasonic sensor.
	 *
	 * @param flexSensor the flexSensor sensor
	 */
	public FlexSensor(AnalogInput flexSensor)
	{
		this.flexSensor = flexSensor;
		scalingFactor = 1;
	}

	public FlexSensor(AnalogInput flexSensor, double scalingFactor)
	{
		this.flexSensor = flexSensor;
		this.scalingFactor = scalingFactor;
	}

	/**
	 * Gets the amount of be d from the flex sensor.
	 *
	 * @return the distance in cm
	 */
	public double getBend()
	{
		return flexSensor.getVoltage() * scalingFactor;
	}
}
