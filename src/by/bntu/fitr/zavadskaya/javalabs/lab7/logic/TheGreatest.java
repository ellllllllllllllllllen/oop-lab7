package by.bntu.fitr.zavadskaya.javalabs.lab7.logic;

import by.bntu.fitr.zavadskaya.javalabs.lab7.view.Outputer;

public class TheGreatest {

	public static int findGreatest(int firstNumber, int secondNumber, int thirdNumber) {
		int result = 0;
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			result = firstNumber;
		}
		if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			result = secondNumber;
		}
		if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			result = thirdNumber;
		}
		if (firstNumber == secondNumber && secondNumber == thirdNumber) {
			Outputer.output("Values are equal.");
		}
		return result;
	}
}
