package week02.day01;

import java.util.Scanner;

public class TrueFalse {
	public static void main(String[] args) {
		/* 1-)Bir ürünün fiyatında %18 KDV ve %15 KAR olduğunu biliyoruz. bir ürün fiyatım olsun
		bu ürün fiyatından ham fiyatını bulalım.
		2-) TL'yi dolara çevir
		3-) İki tane string değişken, (isim ve soyisim), bu değişkenleri tek bir çıktıda alt alta yazdıralım.
		a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.
		4-) Kullanıcıdan önce yaşını, sonrasında da kullanıcının ismini girdi olarak isteyelim. İsmini ve yaşını
		ekrana yazdıralım.
		5-)Dairenin alanını ve çevresini bulalım. (Çap ya da yarıçap input olarak gelsin).
		6-) Dışarıdan 2 adet tam sayı değeri alalım. iki sayının toplamı çift ise true, değil ise false yazdıralım.
		Bu değerlerin bir de ortalamasını alalım ve yazdıralım.
		7-) Dışarıdan girilen bir sayının faktoriyelini alalım.
		8-) 1'den başlayarak, kullanıcının girdiği sayıya kadar olan (sayı dahil) sayıların 1 fazlasının toplamını
		ekrana yazdıran program.
		9-) 1 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene kadar çalışsın.
		en son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını yazdıralım.
		10-) girilen sayının basamakları toplamını ekrana yazdıralım.
		*/
		System.out.println("ilk tam sayiyi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		System.out.println("ikinci tam sayiyi giriniz ");
		int sayi2 = scanner.nextInt();
		int toplam = sayi + sayi2;
		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}