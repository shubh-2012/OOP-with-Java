package Shape;

public class Shape {
	String color;
	
	public Shape(String color) {
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "Shape[color="+color+"]";
	}
	
	public double getArea() {
		System.out.println("Shape not found");
		return 0;
	}
}
