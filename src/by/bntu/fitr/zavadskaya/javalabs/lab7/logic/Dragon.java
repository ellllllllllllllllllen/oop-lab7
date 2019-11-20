package by.bntu.fitr.zavadskaya.javalabs.lab7.logic;

import by.bntu.fitr.zavadskaya.javalabs.lab7.view.Outputer;

public class Dragon {
	public static final int YOUNG = 0;
	public static final int ADULT = 200;
	public static final int OLD = 300;
	public static final int ADULT_HEADS = 2;
	public static final int OLD_HEADS = 1;
	public static final int YOUNG_HEADS = 3;
	public static final int DEFAULT_HEADS = 3;

	public static int countTheNumberOfHeads(int age) {
		int numberOfHeads = 0;
		if (age > YOUNG && age < ADULT) {
			numberOfHeads = DEFAULT_HEADS + YOUNG_HEADS * age;
		}
		if (age > ADULT && age < OLD ) {
			numberOfHeads = DEFAULT_HEADS + YOUNG_HEADS * ADULT + (age - ADULT) * ADULT_HEADS; 
		}
		if (age > OLD) {
			numberOfHeads = DEFAULT_HEADS + YOUNG_HEADS * ADULT + ADULT_HEADS * (OLD - ADULT) + OLD_HEADS * (age - OLD);
		}
		else {
			Outputer.output("Age is not correct.");
		}
		return numberOfHeads;
	}
}
