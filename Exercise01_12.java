package chapter1;
//Ortalama hiz

public class Exercise01_12 {

	public static void main(String[] args) {
		
		double mil = 24.0;
		double km = mil / 1.6; //24 mil = 15 km
		
		double sure_Saat = 6330.0/3600; //1s45dk30sn = 6330sn; 1s = 3600sn; sure = 1.75 saat
		double saatteKm = km / sure_Saat;
		
		System.out.println(saatteKm);	
		
		

	}

}
