package kdvHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tutar;
		System.out.print("Tutar giriniz: ");
		tutar = input.nextDouble();

		if (tutar <= 1000) {
			System.out.println("Ürünün KDV'li tutarý: " + ((tutar * 0.18) + tutar) + "\nÜrün fiyatý: " + tutar
					+ "\nKDV oraný: %18");
		} else {
			System.out.println(
					"Ürünün KDV'li tutarý: " + ((tutar * 0.8) + tutar) + "\nÜrün fiyatý: " + tutar 
					+ "\nKDV oraný: %8");
		}
	}

}
