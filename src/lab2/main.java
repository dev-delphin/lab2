package lab2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar, euro, rubles;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� ��������: ");
		dollar = in.nextInt();
		System.out.println("������� ���������� ����: ");
		euro = in.nextInt();
		System.out.println("������� ������: ");
		rubles = in.nextInt();
		Purse purs= new Purse(dollar, euro, rubles);
		Dollar.dollar_revert();
	}

}
