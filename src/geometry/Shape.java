package geometry;

public class Shape {

	private Point [] points;
	
	public Shape (int size) {
		points=new Point [size];
	}
	public Shape (Point [] p) {
		points=p;
	}
	public Point [] getPoints () {
		return points;
	}
	public void setPoints (Point [] p) {
	   points=p;
	}
	public double area () {
		return 0.0;
	}
	public double perimeter () {
		return 0.0;
	}
}