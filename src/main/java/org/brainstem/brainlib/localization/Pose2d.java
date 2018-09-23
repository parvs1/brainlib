package org.brainstem.brainlib.localization;

import java.util.Locale;

public class Pose2d
{
	private final Vector2d pos;
	private final double heading;

	public Pose2d(Vector2d pos)
	{
		this(pos, 0);
	}

	public Pose2d(Vector2d pos, double heading)
	{
		this.pos = pos;
		this.heading = Angle.normalize(heading);
	}

	public Pose2d(double x, double y)
	{
		this(x, y, 0);
	}

	public Pose2d(double x, double y, double heading)
	{
		this(new Vector2d(x, y), heading);
	}

	public Vector2d pos()
	{
		return pos;
	}

	public double x()
	{
		return pos.x();
	}

	public double y()
	{
		return pos.y();
	}

	public double heading()
	{
		return heading;
	}

	public double dist(Pose2d other)
	{
		return Math.hypot(pos.x() - other.pos.x(), pos.y() - other.pos.y());
	}

	@Override
	public String toString()
	{
		return String.format(Locale.ENGLISH, "<%.2f, %.2f, %.2f> (Degrees: %.2f)", pos.x(), pos.y(), heading, Math.toDegrees(heading));
	}
}