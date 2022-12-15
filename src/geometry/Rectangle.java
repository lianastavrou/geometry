package geometry;

public class Rectangle extends Shape {

	public Rectangle() {
		super(4);
	}
	public Rectangle (Point[] p) {
		super(p);
	}
	public Rectangle (Rectangle r) {
		super(4);
		setPoints(r.getPoints());
	}
	public int getWidth() {
		return getPoints()[1].getX()-getPoints()[0].getX();
	}
	public int getHeight() {
		return getPoints()[1].getY()-getPoints()[2].getY();
	}
	public double area() {
		return getWidth()*getHeight();
	}
	public double perimeter() {
		return 2*getWidth()+2*getHeight();
	}
}

