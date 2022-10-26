package lab2;

/*������� ����������� ����� Currency (������) ��� ������ � ��������� �������. 
 * ���������� ����������� ����� ����������� �����. 
 * ����������� ����������� ������ Dollar (������) � Euro (����) � ������������ �������� �������� � ������ �� �����. 
 * ������� ����� Purse (�������), ���������� ������ �������� ���� �������. 
 * ������������� ����������� ������ ����� �����, ������������ � �����, � ����� �� ������ �� ����*/

public abstract class Currency {

	protected static double Dollar;
	protected static double Euro;
	protected static double Rubles;
	
	
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
}
