package org.brainstem.brainlib.wrappers;

import com.qualcomm.robotcore.hardware.AnalogInput;

/**
 * The class Maxbotix ultrasonic.
 */
public class MaxbotixUltrasonic
{
	//Scaling factor to convert from mV to cm
	private static final double SCALING_FACTOR = 3.2;

	/**
	 * The ultrasonic sensor as an analog input.
	 */
	private AnalogInput ultrasonic;

	/**
	 * Instantiates a new Maxbotix ultrasonic sensor.
	 *
	 * @param ultrasonic the ultrasonic sensor
	 */
	public MaxbotixUltrasonic(AnalogInput ultrasonic)
	{
		this.ultrasonic = ultrasonic;
	}

	/**
	 * Gets the distance ultrasonic sensor senses in cm.
	 *
	 * @return the distance in cm
	 */
	public double getDistance()
	{
		//Converts V to mV and converts it to CM with the scaling factor
		return (ultrasonic.getVoltage() * 1000) / SCALING_FACTOR;
	}
}