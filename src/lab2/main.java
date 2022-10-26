package lab2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar, euro, rubles, eurotorubles, dollartorubles, eurotodollar, dollartoeuro;
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество Долларов 'копейкие через запятую': ");
		dollar = in.nextDouble();
		System.out.println("Введите количество Евро 'копейкие через запятую': ");
		euro = in.nextDouble();
		System.out.println("Введите Рублей 'копейкие через запятую': ");
		rubles = in.nextDouble();
		System.out.println("Отношение Евро к Рублю 'копейкие через запятую': ");
		eurotorubles = in.nextDouble();
		System.out.println("Отношение Доллара у Рублю 'копейкие через запятую': ");
		dollartorubles = in.nextDouble();
		System.out.println("Отношение Евро к Доллару 'копейкие через запятую': ");
		eurotodollar = in.nextDouble();
		System.out.println("Отношение Доллара к Евро 'копейкие через запятую': ");
		dollartoeuro = in.nextDouble();
		Purse purs= new Purse(dollar, euro, rubles, eurotorubles, dollartorubles, eurotodollar, dollartoeuro);
		System.out.println("Выберете нужную операцию: ");
		System.out.println("1. Показать общую сумму в Рублях.\n"+
				"2. Показать общую сумму в Евро.\n"+
				"3. Показать общую сумму в Долларах.\n"+
				"4. Перевести Рубли в Доллары.\n"+
				"5. Перевести Доллары в Рубли.\n"+
				"6. Перевести Рубли в Евро.\n"+
				"7. Перевести Евро в Рубли.\n"+
				"8. Перевести Доллары в Евро.\n"+
				"9. Перевести Евро в Доллары.\n"+
				"10. Выход");
		a = in.nextInt();
		switch(a) {
			case 1:
				Purse.getCountRub();
				break;
			case 2:
				Purse.getCountEuro();
				break;
			case 3:
				Purse.getCountDollar();
				break;
			case 4:
				Purse.getConvertRubleToDollar();
				break;
			case 5:
				Purse.getConvertDoubleToRuble();
				break;
			case 6:
				Purse.getConvertRubleToEuro();
				break;
			case 7:
				Purse.getConvertEuroToRuble();
				break;
			case 8:
				Purse.getConvertDollarToEuro();
				break;
			case 9:
				Purse.getConvertEuroToDollar();
				break;
			case 10:
				break;
				
		}
		Dollar.dollar_revert();
	}

}
