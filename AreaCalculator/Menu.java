import java.util.Scanner;

public class Menu {

	public void printMenu() {
		
		System.out.println("Geometry Calculator");
		
		System.out.println("1. Calculate the Area of a Circle\n"
				+ "2. Calculate the Area of a Rectangle\n"
				+ "3. Calculate the Area of a Triangle\n"
				+ "4. Exit");
		
	}
	
	@SuppressWarnings("resource")
	public double callMethod( int i ) {
		Geometry geometry = new Geometry();
		Scanner scanner = new Scanner(System.in);
		
		switch (i) {
		case 1:
			System.out.println( "Enter the radius of the circle: " );
			double r = scanner.nextDouble();
			return geometry.getAreaOfCircle(r);
			
		case 2:
			System.out.println( "Enter the width of the rectangle: " );
			double w = scanner.nextDouble();
			System.out.println( "Enter the height of the rectangle: " );
			double h = scanner.nextDouble();
			return geometry.getAreaOfRectangle(w, h);
			
		case 3:
			System.out.println( "Enter the base of the triangle: " );
			double b = scanner.nextDouble();
			System.out.println( "Enter the height of the triangle: " );
			double ht = scanner.nextDouble();
			return geometry.getAreaOfTriangle(b, ht);
			
		case 4:
			return 0;

		default:
			return 0;
		}
		
	}
	
}
