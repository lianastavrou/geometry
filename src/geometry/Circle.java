package geometry;

public class Circle extends Shape {
	
	private int radius;
	public static final double PI=3.14159;

	public Circle() {
		super (1);
	}
	public Circle (Point c,int r) {
		super(1);
		radius=r;
		getPoints()[0]=c;
	}
	public int getRadius () {
		return radius;
	}
	public void setRadius (int r) {
		radius=r;
	}
	public double area() {
		return PI*radius*radius;
	}
	public double perimeter() {
		return 2*PI*radius;
	}

}
