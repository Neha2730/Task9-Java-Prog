package task9prog;

import java.util.Scanner;

public class Hoteltariff {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
		int month;
		int n = 0;
        float rent;
        float t = 0, r = 0, t1=0, r1=0; 
        
        
        System.out.println ("Enter the month: ");
        month = scanner.nextInt();
        
        System.out.println ("Enter the room rent: ");
        rent = scanner.nextFloat();
        
        System.out.println ("Enter the number of days: ");
        n = scanner.nextInt();
        
        t = rent * n;
        r = ((rent + (rent * 0.2f)) * n);
        
        switch (month) {
            case 1:
            	System.out.println (t);
                break;
            case 2:
            	System.out.println (t);
                break;
            case 3:
            	System.out.println (t);
                break;
            case 4:
            	System.out.println (r);
                break;
            case 5:
            	System.out.println (r);
                break;
            case 6:
            	System.out.println (r);
                break;
            case 7:
            	System.out.println (t);
                break;
            case 8:
            	System.out.println (t);
                break;
            case 9:
            	System.out.println (t);
                break;
            case 10:
            	System.out.println (r);
                break;
            case 11:
            	System.out.println (r);
                break;
            case 12:
            	System.out.println (r);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }}
