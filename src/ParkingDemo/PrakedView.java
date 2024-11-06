package ParkingDemo;

import java.util.Scanner;

public class PrakedView extends ParkArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total slots");
		totalSlots =sc.nextInt();
		avaiSlots=totalSlots;
		while(true) {
			System.out.println("How may I help you:");
			System.out.println("1.Car Park");
			System.out.println("2.Remove Car");
			System.out.println("3.view parked cars");
			System.out.println("exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				ParkCar();
				break;
			case 2:
				removeCar();
				break;
			case 3:
				ViewParkedCars();
				break;
			case 4:
				System.exit(0);
			case 5:
				System.out.println("Invalid");

			default:
				break;
			}
			
		}

	}

}
