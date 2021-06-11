package ractangle;


class Rectangle1{
	private float length;
	private float breadth;
	
	public Rectangle1() {
		length=1.0f;
		breadth=1.0f;
	}
	
	public Rectangle1(float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getBreadth() {
		return breadth;
	}
	
	public void setLength(float length) {
		this.length=length;
	}
	public void setBreadth(float breadth) {
		this. breadth= breadth;
	}
	
	public double getArea() {
		return length*breadth;
	}
	public double getPerimeter() {
		return 2*(length+breadth);
	}
	
	public String toString() {
		return "Rectangle[length="+ length +","+ "breadth="+ breadth + "]";
	}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rectangle=new Rectangle1(1.2f,3.4f);
		System.out.println(rectangle);
		rectangle.setLength(5);
		rectangle.setBreadth(4);
		System.out.println(rectangle);
		System.out.println(rectangle.getBreadth());
		System.out.println(rectangle.getLength());
		System.out.printf("area is: %.2f%n", rectangle.getArea());
	    System.out.printf("perimeter is: %.2f%n", rectangle.getPerimeter());
	}

}
