package week02.day04;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hosgeldiniz! / Welcome!\nLutfen goruntuleme dilini seciniz. / Please select display " +
				                   "language.\n\n1-- Turkish (TR)\n2-- English (EN)");
		int inputLanguage = scanner.nextInt();
		if (inputLanguage == 1) { //TRnin ifi burda ingilizceye çevirece?in zaman bunun bitimine koycan elseyi
			System.out.println("Lutfen Yapmak istediginiz islemi seciniz.\n\n0-- Cikis Yap.\n1-- Merhaba Dunya yazdir" + ".\n2-- Faktoriyel Hesapla.\n3-- Asal Sayi Kontrolü Yap");
			
			int inputIslem = scanner.nextInt();
			switch (inputIslem) {
				case 0:
					System.out.println("Cikis yapiliyor...");
					break;
				case 1:
					System.out.println("Merhaba Dunya!");
					break;
				case 2:
					System.out.println("Faktöriyelini hesaplamak istediginiz sayiyi girin: ");
					int sayi = scanner.nextInt();
					int faktoriyel = 1;
					for (int i = 1; i <= sayi; i++) {
						faktoriyel *= i;
					}
					System.out.println(sayi + " sayisinin fakroriyeli: " + faktoriyel);
					break;
				case 3:
					System.out.print("Bir SayiAsal giriniz: ");
					int SayiAsal = scanner.nextInt();
					double karekok = Math.sqrt(SayiAsal);
					System.out.println("karekok: " + karekok);
					
					if (SayiAsal == 1) {
						System.out.println("Sectiginiz " + SayiAsal + " sayisi asal degildir.");
					}
					else if (SayiAsal == 2 || SayiAsal == 3) {
						System.out.println("Sectiginiz " + SayiAsal + " sayisi asal sayidir.");
					}
					else {
						for (int i = 2; i <= SayiAsal / 2;
						     i++) { // burada SayiAsal / 2 yar?s?na kadar olan kontrolü ifade ediyo
							if (SayiAsal % i == 0) {
								System.out.println("Sectiginiz " + SayiAsal + " sayisi asal degildir.");
								break;
							}
							System.out.println("Sectiginiz SayiAsal asal sayidir: " + SayiAsal);
							break;
						}
					}
			}
		}
		else if (inputLanguage == 2) {
			System.out.println("Please select the operation you want to perform.\n\n0-- Exit.\n1-- Print Hello World!" + "\n2-- Calculate Factorial.\n3-- Check Prime Number.");
			int inputIslem = scanner.nextInt();
			switch (inputIslem) {
				case 0:
					System.out.println("Exit is in progress...");
					break;
				case 1:
					System.out.println("Hello World!");
					break;
				case 2:
					System.out.println("Enter the number whose factorial you want to calculate: ");
					int sayi = scanner.nextInt();
					int faktoriyel = 1;
					for (int i = 1; i <= sayi; i++) {
						faktoriyel *= i;
					}
					System.out.println(faktoriyel);
					break;
				case 3:
					System.out.print("Enter a number: ");
					int SayiAsal = scanner.nextInt();
					double karekok = Math.sqrt(SayiAsal);
					System.out.println("square root: " + karekok);
					
					if (SayiAsal == 1) {
						System.out.println("The number you have selected " + SayiAsal + " is not a prime number.");
					}
					else if (SayiAsal == 2 || SayiAsal == 3) {
						System.out.println("The number you have selected " + SayiAsal + " is a prime number");
					}
					else {
						for (int i = 2; i <= SayiAsal / 2;
						     i++) { // burada SayiAsal / 2 yar?s?na kadar olan kontrolü ifade ediyo
							if (SayiAsal % i == 0) {
								System.out.println("The number you have selected " + SayiAsal + " is not a prime " +
										                   "number.");
								break;
							}
							System.out.println("The number you have selected " + SayiAsal + " is a prime number");
							break;
						}
					}
			}
		}
		else {
			System.out.println("1 veya 2 disinda bir secim yaptiniz. Lütfen tekrar secim yapiniz.");
		}
	}
}