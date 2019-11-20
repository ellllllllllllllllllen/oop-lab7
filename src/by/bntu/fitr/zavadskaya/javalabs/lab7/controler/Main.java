package by.bntu.fitr.zavadskaya.javalabs.lab7.controler;

import by.bntu.fitr.zavadskaya.javalabs.lab7.logic.Dice;
import by.bntu.fitr.zavadskaya.javalabs.lab7.logic.Dragon;
import by.bntu.fitr.zavadskaya.javalabs.lab7.logic.Letter;
import by.bntu.fitr.zavadskaya.javalabs.lab7.logic.MoodSensor;
import by.bntu.fitr.zavadskaya.javalabs.lab7.logic.TheGreatest;
import by.bntu.fitr.zavadskaya.javalabs.lab7.view.Inputer;
import by.bntu.fitr.zavadskaya.javalabs.lab7.view.Outputer;

public class Main {

	public static void main(String[] args) {
		Outputer.output("Dragon heads number: " + Dragon.countTheNumberOfHeads(Inputer.input("Input dragon age: ")));

		Outputer.output("The greatest number: " + TheGreatest.findGreatest(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Current mood: " + MoodSensor.findOutTheCurrentMood());

		Outputer.output("Total points: " + Dice.scoring());
		Outputer.output("1 way" + Letter.isVowel('a'));
		Outputer.output("2 way" + Letter.isVowel2("a"));
		Outputer.output("3 way" + Letter.isVowel3('a'));

	}

}
