package lab2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar, euro, rubles, eurotorubles, dollartorubles, eurotodollar, dollartoeuro;
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� �������� '�������� ����� �������': ");
		dollar = in.nextDouble();
		System.out.println("������� ���������� ���� '�������� ����� �������': ");
		euro = in.nextDouble();
		System.out.println("������� ������ '�������� ����� �������': ");
		rubles = in.nextDouble();
		System.out.println("��������� ���� � ����� '�������� ����� �������': ");
		eurotorubles = in.nextDouble();
		System.out.println("��������� ������� � ����� '�������� ����� �������': ");
		dollartorubles = in.nextDouble();
		System.out.println("��������� ���� � ������� '�������� ����� �������': ");
		eurotodollar = in.nextDouble();
		System.out.println("��������� ������� � ���� '�������� ����� �������': ");
		dollartoeuro = in.nextDouble();
		Purse purs= new Purse(dollar, euro, rubles, eurotorubles, dollartorubles, eurotodollar, dollartoeuro);
		System.out.println("�������� ������ ��������: ");
		System.out.println("1. �������� ����� ����� � ������.\n"+
				"2. �������� ����� ����� � ����.\n"+
				"3. �������� ����� ����� � ��������.\n"+
				"4. ��������� ����� � �������.\n"+
				"5. ��������� ������� � �����.\n"+
				"6. ��������� ����� � ����.\n"+
				"7. ��������� ���� � �����.\n"+
				"8. ��������� ������� � ����.\n"+
				"9. ��������� ���� � �������.\n"+
				"10. �����");
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
