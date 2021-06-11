package circle;

public class cylinder extends circle {
	private double height;
	
	public cylinder() {
		super();
		this.height=1.0;
		System.out.println("Constructed a Cylinder with cylinder()");  // for debugging
	}
	public cylinder(double height) {
	      super();  // invoke superclass' constructor circle()
	      this.height = height;
	      System.out.println("Constructed a Cylinder with cylinder(height)");  // for debugging
	   }
	public cylinder(double height,double radius) {
	      super(radius);  // invoke superclass' constructor circle()
	      this.height = height;
	      System.out.println("Constructed a Cylinder with cylinder(height,radius)");  // for debugging
	   }
	public cylinder(double height, double radius, String color) {
	      super(radius, color);  // invoke superclass' constructor circle(radius, color)
	      this.height = height;
	      System.out.println("Constructed a Cylinder with cylinder(height, radius, color)");  // for debugging
	   }
	public double getHeight() {
	      return this.height;
	   }
	public void setHeight(double height) {
	      this.height = height;
	   }
	public double getVolume() {
	      return getArea()*height;   // Use Circle's getArea()
	   }
	public String toString() {
	      return "This is a Cylinder"; 
	   }
}
