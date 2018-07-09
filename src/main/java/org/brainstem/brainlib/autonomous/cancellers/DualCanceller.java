package org.brainstem.brainlib.autonomous.cancellers;

public class DualCanceller implements Canceller
{
	Canceller firstCanceller, secondCanceller;
	DualCancelType type;

	public DualCanceller(Canceller firstCanceller, Canceller secondCanceller, DualCancelType type)
	{
		this.firstCanceller = firstCanceller;
		this.secondCanceller = secondCanceller;
		this.type = type;
	}

	public DualCanceller(Canceller firstCanceller, Canceller secondCanceller)
	{
		this.firstCanceller = firstCanceller;
		this.secondCanceller = secondCanceller;
		type = DualCancelType.OR;
	}

	public boolean isConditionMet()
	{
		if (type.equals(DualCancelType.AND))
			return firstCanceller.isConditionMet() && secondCanceller.isConditionMet();
		else
			return firstCanceller.isConditionMet() || secondCanceller.isConditionMet();
	}

	public boolean isFirstConditionMet()
	{
		return firstCanceller.isConditionMet();
	}

	public boolean isSecondConditionMet()
	{
		return secondCanceller.isConditionMet();
	}

	public enum DualCancelType
	{
		AND,
		OR
	}
}
