package lab.pkg23.pkg09;

import java.util.Scanner;

public class Lab2309 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Parking Size: ");
        int n = sc.nextInt();        
        Parking p = new Parking();

        for (int i = 0; i < n; i++) p.newGarage();

        System.out.println("Enter Car RegNumber: ");
        String SearchingRegistration; sc.nextLine();
        SearchingRegistration = sc.nextLine();
        System.out.println("Result:\n " + p.getGarageByVehReg(SearchingRegistration).toString());
    
    }  
}