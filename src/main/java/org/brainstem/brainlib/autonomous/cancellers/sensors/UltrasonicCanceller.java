package org.brainstem.brainlib.autonomous.cancellers.sensors;

import org.brainstem.brainlib.wrappers.MaxbotixUltrasonic;

/**
 * The type Ultrasonic canceller.
 */
public class UltrasonicCanceller extends SensorCanceller
{
	private MaxbotixUltrasonic ultrasonic;

	/**
	 * Instantiates a new Flex sensor canceller.
	 *
	 * @param target     the target
	 * @param condition  the condition
	 * @param ultrasonic the ultrasonic
	 */
	public UltrasonicCanceller(double target, Condition condition, MaxbotixUltrasonic ultrasonic)
	{
		super(target, condition);

		this.ultrasonic = ultrasonic;
	}

	//Returns when the flex sensor can meet the target requirements
	public boolean isConditionMet()
	{
		return checkCondition(ultrasonic.getDistance());
	}
}
