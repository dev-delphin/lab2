package lab2;

public class Dollar extends Currency  {
    
    public Dollar(double dollar) {
     
        Currency.Dollar = dollar;
    }
	
	@Override
	public void revert() {
		// TODO Auto-generated method stub
		
	}
	
	public static void dollar_revert() {
		//System.out.println(getDollar());
	}
	
	public static double DollarToEuro() {
		return Currency.getDollarToEuro()*Currency.getDollar();
	}
	
	public static double DollarToRuble() {
		return Currency.getDollarToRubles()*Currency.getDollar();
	}
	
	public static double RubleToDollar() {
		return Currency.getRubles()/Currency.getDollarToRubles();
	}
	
}
