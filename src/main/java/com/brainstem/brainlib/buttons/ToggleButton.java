package com.brainstem.brainlib.buttons;

public class ToggleButton
{
	private boolean previousState = false, currentState = false;
	private boolean toggle = false;

	public boolean getState()
	{
		return toggle;
	}

	public void setState(boolean state)
	{
		toggle = state;
		previousState = false;
		currentState = false;
	}

	public void update(boolean currentState)
	{
		previousState = this.currentState;
		this.currentState = currentState;

		if (this.currentState && this.currentState != previousState)
			toggle = !toggle;
	}
}