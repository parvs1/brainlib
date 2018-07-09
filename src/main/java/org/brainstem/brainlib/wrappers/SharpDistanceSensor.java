package org.brainstem.brainlib.wrappers;

import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Parv on 1/21/2018.
 */
public class SharpDistanceSensor
{
	//Scaling factor to convert from mV to cm
	private static final double SCALING_FACTOR = 187754;

	/**
	 * The ultrasonic sensor as an analog input.
	 */
	private AnalogInput distanceSensor;

	/**
	 * Instantiates a new Maxbotix ultrasonic sensor.
	 *
	 * @param distanceSensor the distance sensor
	 */
	public SharpDistanceSensor(AnalogInput distanceSensor)
	{
		this.distanceSensor = distanceSensor;
	}

	/**
	 * Gets the distance ultrasonic sensor senses in cm.
	 *
	 * @return the distance in cm
	 */
	public double getDistance()
	{
		double scaledVoltage = Range.scale(distanceSensor.getVoltage(), 0, 3.3, 0, 1023);

		return SCALING_FACTOR * Math.pow(scaledVoltage, -1.5);
	}
}
