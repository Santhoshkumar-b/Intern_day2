package com.santhoshkumar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class firstpage {
	static Scanner sc = new Scanner(System.in);
	static int gst_cabs = 7;
	static double peak_price = 5;
	static double total_tariff = 0.0;
	static int micro_price=10;
	static int sedan_price=15;
	static int innova_price=20;

	public static void main(String[] args) {

		System.out.println("       -------------------------------------------------------");
		System.out.println("                            Welcome to uber             ");
		System.out.println("       ------------------------------------------------------");
		System.out.println(" ");
		System.out.println("    1.Login");
		System.out.println("    2.New User");
		System.out.println("    3.Exit");
		int Login_start = sc.nextInt();
		if (Login_start == 1) {
			Login login = new Login();
			login.loginPage();

		} else if (Login_start == 2) {

		} else if (Login_start == 3) {
			System.out.println("Thank You for using uber");
			System.exit(0);
		} else {
			System.out.println("Please Enter a valid Number");
		}
		String cab_name = " ";
		double final_prices = 0.0;
		String booking_choice = "";
		Bill bill = new Bill();

		System.out.println("Enter the your destination kilometer: ");
		int kiloMeter = sc.nextInt();
		
		LocalDate current_date = LocalDate.now();
		
		System.out.println("Please Enter your journey data :");
		String Booking_date = sc.next();
		
		LocalDate date = LocalDate.parse(Booking_date);
		System.out.println("Please Enter your Pick up time: ");
		String PickupTime = sc.next();
		
		LocalTime time = LocalTime.parse(PickupTime);
		int hour = time.getHour();
		
		System.out.println("Enter your date of birth: ");
		String datebirth = sc.next();
		LocalDate dateofBirth = LocalDate.parse(datebirth);
		
		int age = Period.between(dateofBirth, current_date).getYears();
		System.out.println("Select your cab choice");
		System.out.println("1.Micro");
		System.out.println("2.Sedan");
		System.out.println("3.Innova");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			micro m = new micro();
			final_prices = m.fareprices_micro(kiloMeter, hour, age);
			cab_name = "Micro";
			System.out.println("Do you want to conform your booking type yes/no:");
			booking_choice = sc.next();
			if (booking_choice.equals("yes") || booking_choice.equals("YES")) {

				bill.billingDetails(cab_name, final_prices, date, time);
			} else {
				System.exit(0);
			}

			break;
		case 2:
			sedan s = new sedan();
			final_prices = s.fareprices_sedan(kiloMeter, hour, age);
			cab_name = "Sedan";
			System.out.println("Do you want to conform your booking type yes/no:");
			booking_choice = sc.next();

			if (booking_choice.equals("yes") || booking_choice.equals("YES")) {

				bill.billingDetails(cab_name, final_prices, date, time);
			} else {
				System.exit(0);
			}

			break;
		case 3:
			Innova innova = new Innova();
			final_prices = innova.fareprices_innova(kiloMeter, hour, age);
			cab_name = "Innova";
			System.out.println("Do you want to conform your booking type yes/no:");
			booking_choice = sc.next();
			if (booking_choice.equals("yes") || booking_choice.equals("YES")) {

				bill.billingDetails(cab_name, final_prices, date, time);
			} else {
				System.exit(0);
			}
			break;

		default:
			System.out.println("Please select a valid cab name");
		}
		sc.close();

	}
	// TODO Auto-generated method stub
	

}
