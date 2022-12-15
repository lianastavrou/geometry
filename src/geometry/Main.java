package geometry;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Point p1=new Point(1,1);
		Point[]p=  {new Point(2,2),new Point(8,2),
				    new Point(8,-1),new Point(2,-1)
		};
		
	    int selection=Integer.parseInt(JOptionPane.showInputDialog("Παρακαλώ διαλέξτε σχήμα."
	    		+ "Πατήστε 1 για κύκλο,2 για ορθογώνιο"));
	    Shape s = null;
	    switch (selection) {
	    case 1:
	    	s = new Circle(p1,4);
	    	break;
	    case 2:
	    	s = new Rectangle();
	    	s.setPoints(p);
	    	break;
	    default:
	    	System.out.println("Άκυρη επιλογή");
	    	System.exit(0);
	    }
	    System.out.println("περίμετρος : " + s.perimeter());
	    System.out.println("εμβαδό : " + s.area());
	    System.exit(0);

	}

}
 
