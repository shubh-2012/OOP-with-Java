package circle;

public class circle {  // Save as "Circle.java"
	   // private instance variable, not accessible from outside this class
	   private double radius;
	   private String color;
	   
	   // Constructors (overloaded)
	   /** Constructs a Circle instance with default value for radius and color */
	   public circle() {  // 1st (default) constructor
	      radius = 1.0;
	      color = "red";
	   }
	   
	   /** Constructs a Circle instance with the given radius and default color */
	   public circle(double r) {  // 2nd constructor
	      radius = r;
	      this.color = "red";
	   }
	   public circle(double r,String color) {  // 2nd constructor
		      this.radius = r;
		      this.color = color;
		   }
	   
	   /** Returns the radius */
	   public double getRadius() {
	     return radius; 
	   }
	   
	   public String getColor() {
		   return this.color;
	   }
	   
	   /** Returns the area of this Circle instance */
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	}


