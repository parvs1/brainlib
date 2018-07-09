package org.brainstem.brainlib.utils;

/**
 * Created by parvs on 7/6/2018.
 */

public class BulkRevHubData
{
	private int[] motorEncoderPositions;

	public void update(int[] motorEncoderPositions)
	{
		this.motorEncoderPositions = motorEncoderPositions;
	}
}
