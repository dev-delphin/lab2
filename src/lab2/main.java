package lab2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar, euro, rubles;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество Долларов: ");
		dollar = in.nextInt();
		System.out.println("Введите количество Евро: ");
		euro = in.nextInt();
		System.out.println("Введите Рублей: ");
		rubles = in.nextInt();
		Purse purs= new Purse(dollar, euro, rubles);
		Dollar.dollar_revert();
	}

}
