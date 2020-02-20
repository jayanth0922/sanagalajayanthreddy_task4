package epam_task4;

import java.util.Scanner;

public class Main2 {
	static String material;
	static boolean is_automated;
	static int area;
	static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		System.out.format("%s","Enter Material Type (Standard,Above,High):-");material=input.next();
		System.out.format("%s","Enter Area of house in square feets :-");area=input.nextInt();
		System.out.format("%s","Enter Is House should beFully automated  home or not (true,false):-");is_automated=input.nextBoolean();
		HouseConstructionCost obj=new HouseConstructionCost();
		System.out.format("Overall Estimation Cost for House Construction is:-%d",obj.costEstimation(material,area,is_automated));
	}

}
