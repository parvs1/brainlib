package org.brainstem.brainlib.autonomous.cancellers;

/**
 * The class Timer canceller.
 */
public class TimerCanceller implements Canceller
{
	private double ms, start;

	/**
	 * Instantiates a new Timer canceller.
	 *
	 * @param ms the ms
	 */
	public TimerCanceller(double ms)
	{
		this.ms = ms;
		start = System.currentTimeMillis();
	}

	//Returns if the time requirement is met
	public boolean isConditionMet()
	{
		return start + ms < System.currentTimeMillis();
	}
}
