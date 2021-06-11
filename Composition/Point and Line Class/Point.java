package point_and_line;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public int[] getXY(){
		int[] arr=new int[2];
		arr[0]=x;
		arr[1]=y;
		return arr;
	}
	public void setXY(int x,int y) {
		this.x=x;
		this.y=y;
	}
	 public double distance(int x, int y) {
	      int xDiff = this.x - x;
	      int yDiff = this.y - y;
	      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   }
	   /** Returns the distance from this instance to the given Point instance. Invoke via p1.distance(p2) */
	   public double distance(Point another) {
	      int xDiff = this.x - another.x;
	      int yDiff = this.y - another.y;
	      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   }
	   /** Returns the distance from this instance to (0,0). Invoke via p1.distance() */
	   public double distance() {
	      return Math.sqrt(this.x*this.x + this.y*this.y);
	   }
}
