package org.brainstem.brainlib.localization;

public class Angle
{
	public static double normalize(double angle)
	{
		angle = angle % 360;

		angle = (angle + 360) % 360;

		if (angle > 180)
		{
			angle -= 360;
		}

		return angle;
	}
}