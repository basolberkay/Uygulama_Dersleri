package week02.day02;

import java.util.Scanner;

public class quest066 {
	public static void main(String[] args) {
	/* Telefon kodu ve Email kodumuz olsun (Numerik ve bunlar? elle girebiliriz) Sonras?nda kullan?c?dan kodlar?
	girmesini isteyece?iz,
		 e-mail kodu hatal?ysa ona göre bir mesaj
		, sms kodu hatal?ysa ona göre bir mesaj, ikisi de do?ru girildi?inde de "Ba?ar?yla giri? yapt?n?z". */
		int tc = 1520;
		int ec = 4231;
		Scanner scanner = new Scanner(System.in);
		System.out.println("telefon kodunu giriniz");
		int giristc = scanner.nextInt();
		System.out.println("maile gelen kodunu giriniz");
		int girisec = scanner.nextInt();
		if (tc == giristc && ec == girisec) {
			System.out.println("basariyla giris yaptiniz");
		}
		else if (tc != giristc) {
			System.out.println("Telefon kodunu yanlis girdiniz.");
		}
		else if (ec != girisec) {
			System.out.println("mail kodunu yanlis girdiniz. asdas");
		}
		
		
	}
}