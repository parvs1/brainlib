package org.brainstem.brainlib.wrappers;

import com.qualcomm.robotcore.hardware.DigitalChannel;

/**
 * The class Limit switch.
 */
public class LimitSwitch
{
	/**
	 * The Limit switch.
	 */
	private DigitalChannel limitSwitch;

	/**
	 * Instantiates a new limit switch.
	 *
	 * @param limitSwitch the limit switch
	 */
	public LimitSwitch(DigitalChannel limitSwitch)
	{
		this.limitSwitch = limitSwitch;
	}

	/**
	 * Returns true if limit switch is pressed.
	 * Returns false if limit switch is not pressed.
	 *
	 * @return whether the limit switched is pressed
	 */
	public boolean isTouched()
	{
		return limitSwitch.getState();
	}
}
