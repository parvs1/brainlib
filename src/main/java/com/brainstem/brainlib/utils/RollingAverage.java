package com.brainstem.brainlib.utils;

import java.util.ArrayList;

/**
 * Created by Parv Shrivastava on 3/30/2018.
 */

public class RollingAverage
{
	private ArrayList<Double> values;
	private boolean firstTime;
	private double average;
	private int n;

	public RollingAverage(int n)
	{
		values = new ArrayList<>(n);
		firstTime = true;
	}

	public double getAverage(double value)
	{
		if (Double.isNaN(value) || Double.isInfinite(value))
			return average;

		if (firstTime)
		{
			for (int i = 0; i < n; i++)
				values.add(value);
			firstTime = false;
			return value;
		} else
		{
			values.remove(0);
			values.add(value);
		}

		average = calculateAverage(values);

		return average;
	}

	private double calculateAverage(ArrayList<Double> list)
	{
		double sum = 0;

		for (double item : list)
			sum += item;

		return sum / (double) list.size();
	}
}
