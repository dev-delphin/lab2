package lab2;

/*Создать абстрактный класс Currency (валюта) для работы с денежными суммами. 
 * Определить абстрактный метод конвертации валют. 
 * Реализовать производные классы Dollar (доллар) и Euro (евро) с собственными методами перевода и вывода на экран. 
 * Создать класс Purse (кошелек), содержащий массив объектов этих классов. 
 * Предусмотреть возможность вывода общей суммы, переведенной в рубли, и суммы по каждой из валю*/

public abstract class Currency {

	protected static double Dollar;
	protected static double Euro;
	protected static double Rubles;
	protected static double EuroToRubles;
	protected static double DollarToRubles;
	protected static double EuroToDollar;
	protected static double DollarToEuro;
	
	public abstract void revert();

	public static double getDollar() {
		return Dollar;
	}

	public static void setDollar(double dollar) {
		Dollar = dollar;
	}

	public static double getEuro() {
		return Euro;
	}

	public static void setEuro(double euro) {
		Euro = euro;
	}

	public static double getRubles() {
		return Rubles;
	}

	public static void setRubles(double rubles) {
		Rubles = rubles;
	}
	
	public static double getEuroToRubles() {
		return EuroToRubles;
	}

	public static void setEuroToRubles(double eurotorubles) {
		EuroToRubles = eurotorubles;
	}
	
	public static double getDollarToRubles() {
		return DollarToRubles;
	}

	public static void setDollarToRubles(double dollartorubles) {
		DollarToRubles = dollartorubles;
	}
	
	public static double getEuroToDollar() {
		return EuroToDollar;
	}

	public static void setEuroToDollar(double dollartoeuro) {
		EuroToDollar = dollartoeuro;
	}
	
	public static double getDollarToEuro() {
		return DollarToEuro;
	}

	public static void setDollarToEuro(double dollartoeuro) {
		DollarToEuro = dollartoeuro;
	}
}
