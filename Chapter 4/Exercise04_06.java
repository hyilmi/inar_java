package chapter4;

public class Exercise04_06 {

	public static void main(String[] args) {
		final int R = 40;
		
		double a1 = Math.random() * 2 * Math.PI;
		double a2 = Math.random() * 2 * Math.PI;
		double a3 = Math.random() * 2 * Math.PI;
		
		double x1 = R * Math.cos(a1);
		double y1 = R * Math.sin(a1);
		double x2 = R * Math.cos(a2);
		double y2 = R * Math.sin(a2);
		double x3 = R * Math.cos(a3);
		double y3 = R * Math.sin(a3);
		
		//triangle sides
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		//angles
		double A = Math.acos((a*a - b*b - c*c) / (-2*b*c));
		double B = Math.acos((b*b - a*a - c*c) / (-2*a*c));
		double C = Math.acos((c*c - b*b - a*a) / (-2*a*b));
		
		System.out.println(a + ", " + b + ", " + c);
		
	}

}
