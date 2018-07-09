package org.brainstem.brainlib.autonomous.cancellers.sensors;

import org.brainstem.brainlib.wrappers.FlexSensor;

/**
 * The class Flex sensor canceller.
 */
public class FlexSensorCanceller extends SensorCanceller
{
	private FlexSensor flexSensor;

	/**
	 * Instantiates a new Flex sensor canceller.
	 *
	 * @param target     the target
	 * @param flexSensor the flex sensor
	 * @param condition  the condition
	 */
	public FlexSensorCanceller(double target, FlexSensor flexSensor, Condition condition)
	{
		super(target, condition);

		this.flexSensor = flexSensor;
	}

	//Returns when the flex sensor can meet the target requirements
	public boolean isConditionMet()
	{
		return checkCondition(flexSensor.getBend());
	}
}

