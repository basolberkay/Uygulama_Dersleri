package week02.day02;

import java.util.Scanner;

public class quest01 {
	public static void main(String[] args) {
		// "kullaniciIsmi + "n üzeri x isleminin sonucu " "
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taban degerini giriniz: ");
		int tabanDegeri = scanner.nextInt();
		System.out.println("us degerini girin: ");
		int usDegeri = scanner.nextInt();
		scanner.nextLine();
		double sonuc = Math.pow(tabanDegeri, usDegeri);
		System.out.println("Adinizi giriniz: ");
		String ad = scanner.nextLine();
		System.out.println(ad+" "+sonuc);
		scanner.close();
		
		
	}
}