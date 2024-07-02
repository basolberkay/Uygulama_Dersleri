package week02.day01;

import java.util.Scanner;

public class quest8 {
	public static void main(String[] args) {
		/* 1'den ba?layarak, kullan?c?n?n girdi?i say?ya kadar olan (say? dahil) say?lar?n 1 fazlas?n?n toplam?n?
		ekrana yazd?ran program.*/
		System.out.println("Bir sayi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (i+1);
			System.out.println("1'den "+ n +" 'kadar olan sayilarin 1 fazlasinin toplami: "+ sum);
			scanner.close();
		}
		
		
		
		
	}
}