package electricitybill;
import java.util.Scanner;
public class Electricitybill {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the units consumed: ");
	        int units = scanner.nextInt();

	        double charges;

	        if (units <= 100) {
	            charges = units * 1.20;
	        } else if (units <= 300) {
	            charges = 100 * 1.20 + (units - 100) * 2;
	        } else {
	            charges = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
	        }

	        System.out.printf("Electricity bill: Rs. %.2f", charges);
	    }
	}
