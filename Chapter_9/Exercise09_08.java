package chapter9;

public class Exercise09_08 {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setOn(true);
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		System.out.println(fan1.toString());
		
		fan2.setOn(true);
		fan2.setSpeed(2);
		System.out.println(fan2.toString());

	}

}

class Fan{
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	Fan(){
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String result = "";
		if (on) {
			if (speed == SLOW) {
				result += "Fan speed: slow | ";
			}else if (speed == MEDIUM) {
				result += "Fan speed: medium | ";
			}else {
				result += "Fan speed: fast | ";
			}
			
			result += "Color: " + color + " | ";
			result += "Radius: " + radius + " | ";
			
		}else {
			result += "The fan is off. | ";
			result += "Color: " + color + " | ";
			result += "Radius: " + radius + " | ";
		}
		
		return result;
	}
	
	
}