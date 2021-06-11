package circle;

class Circle1 { 
	   // private instance variable, not accessible from outside this class
	   private double radius;
	   private String color;
	   
	   // Constructors (overloaded)
	   /** Constructs a Circle instance with default value for radius and color */
	   public Circle1() {  // 1st (default) constructor
	      radius = 1.0;
	      color = "red";
	   }
	   
	   /** Constructs a Circle instance with the given radius and default color */
	   public Circle1(double r) {  // 2nd constructor
	      radius = r;
	      color = "red";
	   }
	   
	   /** Returns the radius */
	   public double getRadius() {
	     return radius; 
	   }
	   
	   /** Returns the area of this Circle instance */
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	}

class Circle {  
	   public static void main(String[] args) {
	      // Declare an instance of Circle1 class called c1.
	      // Construct the instance c1 by invoking the "default" constructor
	      // which sets its radius and color to their default value.
	      Circle1 c1 = new Circle1();
	      // Invoke public methods on instance c1, via dot operator.
	      System.out.println("The circle has radius of " 
	         + c1.getRadius() + " and area of " + c1.getArea());
	      //The circle has radius of 1.0 and area of 3.141592653589793
	   
	      // Declare an instance of class circle1 called c2.
	      // Construct the instance c2 by invoking the second constructor
	      // with the given radius and default color.
	      Circle1 c2 = new Circle1(2.0);
	      // Invoke public methods on instance c2, via dot operator.
	      System.out.println("The circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea());
	      //The circle has radius of 2.0 and area of 12.566370614359172
	   }
	}
