package lab2;

public class Purse {

	public Purse(double dollar, double euro, double rubles, double eurotorubles, double dollartorubles, double eurotodollar, double dollartoeuro) {
        Currency.setDollar(dollar);
        Currency.setEuro(euro);
        Currency.setRubles(rubles);
        Currency.setEuroToRubles(eurotorubles);
        Currency.setDollarToRubles(dollartorubles);
        Currency.setEuroToDollar(eurotodollar);
        Currency.setDollarToEuro(dollartoeuro);
    }
	
	public static void getCountRub() {
		System.out.println(Dollar.DollarToRuble()+Euro.EuroToRuble()+Currency.getRubles());
	}
	
	public static void getCountEuro() {
		System.out.println(Euro.RubleToEuro()+Euro.EuroToDollar()+Currency.getEuro());
	}
	
	public static void getCountDollar() {
		System.out.println(Dollar.RubleToDollar()+Dollar.DollarToEuro()+Currency.getDollar());
	}
	
	public static void getConvertRubleToDollar() {
		System.out.println(Dollar.RubleToDollar());
	}
	
	public static void getConvertDoubleToRuble() {
		System.out.println(Dollar.DollarToRuble());
	}
	
	public static void getConvertRubleToEuro() {
		System.out.println(Euro.RubleToEuro());
	}
	
	public static void getConvertEuroToRuble() {
		System.out.println(Euro.EuroToRuble());
	}
	
	public static void getConvertDollarToEuro() {
		System.out.println(Dollar.DollarToEuro());
	}
	
	public static void getConvertEuroToDollar() {
		System.out.println(Euro.EuroToDollar());
	}

}
