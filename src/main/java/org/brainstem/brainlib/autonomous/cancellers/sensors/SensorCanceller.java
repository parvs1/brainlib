package org.brainstem.brainlib.autonomous.cancellers.sensors;

import org.brainstem.brainlib.autonomous.cancellers.Canceller;

public abstract class SensorCanceller implements Canceller
{
	protected double target;
	protected Condition condition;

	public SensorCanceller(double target, Condition condition)
	{
		this.target = target;
		this.condition = condition;
	}

	public boolean checkCondition(double current)
	{
		switch (condition)
		{
			case LESS:
				return current < target;
			case LESS_OR_EQUAL:
				return current <= target;
			case GREATER:
				return current > target;
			case GREATER_OR_EQUAL:
				return current >= target;
			case NOT_EQUALS:
				return current != target;
			default:
				return true;
		}
	}

	public enum Condition
	{
		LESS,
		LESS_OR_EQUAL,
		GREATER,
		GREATER_OR_EQUAL,
		NOT_EQUALS,
		IN_RANGE
	}
}
