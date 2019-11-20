package by.bntu.fitr.zavadskaya.javalabs.lab7.view;

import java.util.Scanner;

public class Inputer {

	static Scanner scanner = new Scanner(System.in);

	public static int input(String message) {
		System.out.println(message);
		return scanner.nextInt();
	}
}
