package org.brainstem.brainlib.localization;

public class Angle
{
	public static final double TAU = Math.PI * 2;

	public static double normalize(double angle) {
		angle = angle % TAU;

		angle = (angle + TAU) % TAU;

		if (angle > Math.PI) {
			angle -= TAU;
		}

		return angle;
	}

}