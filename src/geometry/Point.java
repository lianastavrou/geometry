package geometry;

public class Point {
	private int x;
	private int y;
	
	public Point () {}
	public Point (int p_x,int p_y) {
		x=p_x;
		y=p_y;
	}
	
	public Point (Point p) {
		x=p.getX();
		y=p.getY();
	}

	public void setX (int p_x) {
		x=p_x;
	}
	
	public int getX () {
		return x;
	}
	public void setY (int p_y) {
		y=p_y;
	}
	public int getY () {
		return y;
	}
	public void displayCoords () {
		System.out.print("x=" + x);
		System.out.println("y=" + y);
	}
}

