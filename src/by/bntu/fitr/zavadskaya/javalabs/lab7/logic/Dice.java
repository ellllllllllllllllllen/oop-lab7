package by.bntu.fitr.zavadskaya.javalabs.lab7.logic;

import java.util.Random;

public class Dice {

	private static final int MIN_POINTS = 1;
	private static final int MAX_POINTS = 6;

	public static int scoring() {
		Random random = new Random();
		int numberOfPointsOnFirst = random.nextInt((MAX_POINTS - MIN_POINTS) + 1) + MIN_POINTS;
		int numberOfPointsOnSecond = random.nextInt((MAX_POINTS - MIN_POINTS) + 1) + MIN_POINTS;

		return numberOfPointsOnFirst + numberOfPointsOnSecond;
	}
}
