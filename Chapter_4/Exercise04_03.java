package chapter4;

public class Exercise04_03 {

	public static void main(String[] args) {
		
		double AtlantaX = 33.748760;
		double AtlantaY = -84.387410;
		double OrlandoX = 28.537869;
		double OrlandoY = -81.379483;
		double SavannahX = 32.080745;
		double SavannahY = 81.091219;
		double CharlotteX = 35.226280;
		double CharlotteY = -80.842018;
		
		//Distances between adjacent cities
		double A_C = Math.sqrt((AtlantaX - CharlotteX) * (AtlantaX - CharlotteX) + (AtlantaY - CharlotteY) * (AtlantaY - CharlotteY));
		double A_O = Math.sqrt((AtlantaX - OrlandoX) * (AtlantaX - OrlandoX) + (AtlantaY - OrlandoY) * (AtlantaY - OrlandoY));
		double A_S = Math.sqrt((AtlantaX - SavannahX) * (AtlantaX - SavannahX) + (AtlantaY - SavannahY) * (AtlantaY - SavannahY));
		double C_S = Math.sqrt((CharlotteX - SavannahX) * (CharlotteX - SavannahX) + (CharlotteY - SavannahY) * (CharlotteY - SavannahY));
		double S_O = Math.sqrt((SavannahX - OrlandoX) * (SavannahX - OrlandoX) + (SavannahY - OrlandoY) * (SavannahY - OrlandoY));
		
		//Area of the Atlanta-Charlotte-Savannah triangle
		double s1 = (A_C + A_S + C_S) / 2;
		double areaACS = s1 * (s1 - A_C) * (s1 - A_O) * (s1 - C_S);
		//Area of the Atlanta-Orlando-Savannah triangle
		double s2 = (A_O + A_S + S_O) / 2;
		double areaAOS = Math.sqrt(s2 * (s2 - A_O) * (s2 - A_S) * (s2 - S_O));
		//Total area
		System.out.println(areaACS + areaAOS);

		}

}
