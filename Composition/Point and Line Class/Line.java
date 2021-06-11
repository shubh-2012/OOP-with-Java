package point_and_line;

public class Line {
	Point begin,end;
	
	public Line(int x1,int y1,int x2,int y2) {
		begin=new Point(x1,y1);
		end= new Point(x2,y2);
	}
	
	public Line(Point begin,Point end) {
		this.begin=begin;
		this.end=end;
	}
	
	public Point getBegin() {
		return this.begin;
	}
	
	public void setBegin(Point begin) {
		this.begin=begin;
	}
	public Point getEnd() {
		return this.end;
	}
	
	public void setEnd(Point end) {
		this.end=end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	public int getBeginY() {
		return this.begin.getY();
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	public void setBeginY(int y) {
		this.begin.setX(y);
	}
	public int[] getBeginXY() {
		return this.begin.getXY();
	}
	public void setBeginXY(int x,int y) { 
		this.begin.setXY(x,y);
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	public int getEndY() {
		return this.end.getY();
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	public void setEndY(int y) {
		this.end.setX(y);
	}
	public int[] getEndXY() {
		return this.end.getXY();
	}
	public void setEndXY(int x,int y) { 
		this.end.setXY(x,y);
	}
	
	public double getLength() {
		return begin.distance(end);
	}
	
	public String toString() {
		return "Line[begin="+begin.toString()+"'"+end.toString()+"]";
	}
}
