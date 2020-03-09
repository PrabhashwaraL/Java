import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		
		menu.printMenu();
		
		System.out.println("Enter Your Choice: ");
		int m = scanner.nextInt();
		
		if( m > 0 && m < 5) {
			double result;
			result = menu.callMethod(m);
			
			if( result == 0 ) {
				System.out.println("---- Thank You ----");
			} 
			else if( result == -1 ) {
				System.out.println( "Invalid input" );
			}
			else {
				System.out.printf( "result: " + "%.2f", result);
			}
		}
		else {
			System.out.println("Invalid input");
			System.exit(0);
		}
		scanner.close();

	}

}
