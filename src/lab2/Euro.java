package lab2;

public class Euro extends Currency{

	@Override
	public void revert() {
		// TODO Auto-generated method stub
		
	}
	
	public void euro_revert() {
		System.out.println(super.getDollar());
	}
	
	public static double EuroToDollar() {
		return Currency.getEuro()/Currency.getEuroToDollar();
	}
	
	public static double EuroToRuble() {
		return Currency.getEuro()*Currency.getEuroToRubles();
	}
	
	public static double RubleToEuro() {
		return Currency.getRubles()/Currency.getEuroToRubles();
	}
	
}
