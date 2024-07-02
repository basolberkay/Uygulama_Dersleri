package week02.day01;

import java.util.Scanner;

public class Faktoriyel {
	public static void main(String[] args) {
		System.out.println("Faktoriyelini almak istediginiz sayiyi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		int faktoriyel = 1;
		for (int i = 2; i <= sayi; i++) {
			faktoriyel *= i;
			System.out.println(faktoriyel);
			
		}
		
		
	}
}