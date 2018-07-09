package org.brainstem.brainlib.autonomous.cancellers;

/**
 * The interface Canceller.
 */
public interface Canceller
{
	/**
	 * If the condition is met, it returns true;
	 * Else, it returns false.
	 *
	 * @return the boolean if condition is met
	 */
	boolean isConditionMet();
}
