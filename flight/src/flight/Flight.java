package flight;
import java.util.Scanner;

public class Flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the number of rows: ");
		        int n = sc.nextInt();

		        int totalPassengers = 0;

		        for (int i = 1; i <= n; i++) {
		            System.out.printf("Enter the number of people in row %d: ", i);
		            int rowPassengers = sc.nextInt();
		            totalPassengers += rowPassengers;
		        }

		        System.out.printf("The total number of passengers on the flight is %d", totalPassengers);
		    }
		}
