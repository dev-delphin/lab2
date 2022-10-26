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
		System.out.println(getDollar());
	}
	
}
