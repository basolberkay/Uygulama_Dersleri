package week02.day03;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		/* Bir say?n?n asal olup olmad???n? anlamak için
		 2'den ba?layarak say?n?n yar?s?na kadar olan say?larla kontrol ederiz.
		 E?er bu say?lardan herhangi biriyle bölünüyorsa, say? asal de?ildir.
		 E?er hiçbiriyle bölünmüyorsa, say? asald?r.
		
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		double karekok = Math.sqrt(sayi);
		System.out.println("karekok: " + karekok);
		
		if (sayi == 1) {
			System.out.println("Sectiginiz " + sayi + " sayisi asal degildir.");
		} else if (sayi == 2 || sayi == 3) {
			System.out.println("Sectiginiz " + sayi + " sayisi asal sayidir.");
		} else {
			for (int i = 2; i <= sayi / 2; i++) { // burada sayi / 2 yar?s?na kadar olan kontrolü ifade ediyo
				if (sayi % i == 0) {
					System.out.println("Sectiginiz " + sayi + " sayisi asal degildir.");
					break;
			}
				System.out.println("Sectiginiz sayi asal sayidir: " + sayi);
	}
			
	
	}
        }
}