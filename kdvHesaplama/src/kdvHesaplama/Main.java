package kdvHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tutar;
		System.out.print("Tutar giriniz: ");
		tutar = input.nextDouble();

		if (tutar <= 1000) {
			System.out.println("�r�n�n KDV'li tutar�: " + ((tutar * 0.18) + tutar) + "\n�r�n fiyat�: " + tutar
					+ "\nKDV oran�: %18");
		} else {
			System.out.println(
					"�r�n�n KDV'li tutar�: " + ((tutar * 0.8) + tutar) + "\n�r�n fiyat�: " + tutar 
					+ "\nKDV oran�: %8");
		}
	}

}
