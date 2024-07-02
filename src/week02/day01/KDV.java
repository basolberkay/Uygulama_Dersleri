package week02.day01;

public class KDV {
	public static void main(String[] args) {
		float hamFiyat = 0f, satisFiyati = 256f, kdv = 0.18f, kar = 0.15f, kdvsizFiyat;
		kdvsizFiyat = satisFiyati - (satisFiyati * kdv);
		System.out.println("KDV'siz fiyat: " + kdvsizFiyat);
		hamFiyat = kdvsizFiyat - (kdvsizFiyat * kar);
		System.out.println("Ham fiyat: " + hamFiyat);
		
		
	}
}