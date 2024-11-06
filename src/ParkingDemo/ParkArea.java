package ParkingDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkArea {
		static int avaiSlots,totalSlots;
		static ArrayList<String> parkedCars=new ArrayList<String>();
		
		public static void ParkCar() {
			if(avaiSlots==0) {
				System.out.println("No Space for Parling");
				return;
			}
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Liscence Number");
			String LisNo=scan.nextLine();
			parkedCars.add(LisNo);
			avaiSlots--;
			System.out.println("Car parked Sucessfully");
			
		}
		public static void removeCar() {
			if(avaiSlots==totalSlots) {
				System.out.println("There are no parked cars");
				return;
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Liscence Number");
			String LisNo=sc.nextLine();
			if(parkedCars.contains(LisNo)) {
			parkedCars.remove(LisNo);
			avaiSlots++;
			System.out.println("Car removed");
			}else {
				System.out.println("No car is available");
			}
			
		}
		public static void ViewParkedCars() {
			if (avaiSlots == totalSlots) {
	            System.out.println("There are no parked cars.");
	            return;
	        }

	        System.out.println("Parked cars:");
	        for (String licensePlate : parkedCars) {
	            System.out.println(licensePlate);
	        }
		}
		
}
