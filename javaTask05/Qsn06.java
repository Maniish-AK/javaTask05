package javaTask05;

import java.util.Scanner;

public class Qsn06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        float rentPerDay = sc.nextFloat();
        
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = sc.nextInt();
        
        float finalTariff;
        
        switch (month) {
            case 4: // April
            case 5: // May
            case 6: // June
            case 11: // November
            case 12: // December
                finalTariff = rentPerDay * daysStayed * 1.2f;
                break;
            default:
                finalTariff = rentPerDay * daysStayed;
                break;
        }
        
        System.out.printf("%.2f\n", finalTariff);

	}

}
