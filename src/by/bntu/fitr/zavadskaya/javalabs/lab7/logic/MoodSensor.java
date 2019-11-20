package by.bntu.fitr.zavadskaya.javalabs.lab7.logic;

import java.util.Random;


public class MoodSensor {

	public static String findOutTheCurrentMood() {
		Random random = new Random();
		String currentMood = "";
		int value = random.nextInt(4);
		if (value == 1) {
			currentMood = ":(";
		}
		if(value == 2) {
			currentMood = ":)";
			
		}
		if(value == 3) {
			currentMood = ":|";
		}
		return currentMood;
	}
}
