package org.brainstem.brainlib.buttons;

public class StickyButton
{
    protected boolean previousState = false, currentState = false;

    public boolean getState()
    {
        //Returns true if the current state of the button is pressed,
        //and it was not pressed before
        return currentState && currentState != previousState;
    }

    public void update(boolean currentState)
    {
        previousState = this.currentState;
        this.currentState = currentState;
    }
}