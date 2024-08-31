package d_31082024;

import java.util.Scanner;

public class CustomExceptionEg {
	public static void main(String[] args) {
		try {
			met();
		} catch (InvalidPlanException ie) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Exception occured "+ie);
		}
	}



//static void met() throws InvalidPlanException {
static void met() {
	Scanner scnr = new Scanner(System.in);
	System.out.println("To recharge, Enter your plan");
	int plan_id=scnr.nextInt();
	if(plan_id<1 || plan_id>10||plan_id==8) {
		throw new InvalidPlanException(plan_id+" is invalid");
	}
}
}
