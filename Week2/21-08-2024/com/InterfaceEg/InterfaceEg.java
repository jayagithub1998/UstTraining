package com.InterfaceEg;

interface Circle{
	
	double PI=3.14;
	double getSurfaceArea(double radius);
	double getCircumference(double radius);
}


class CircleImp implements Circle{

	@Override
	public double getSurfaceArea(double radius) {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double getCircumference(double radius) {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
	
}
public class InterfaceEg {
	public static void main(String[] args) {
	/*	CircleImp cobj = new CircleImp();
		double area= cobj.getSurfaceArea(3);
		System.out.println("area "+area);
		double circumference=cobj.getCircumference(3);
		System.out.println("circumference "+circumference); */
		
		
		Circle cobj = new CircleImp();
		double area= cobj.getSurfaceArea(3);
		System.out.println("area "+area);
		double circumference=cobj.getCircumference(3);
		System.out.println("circumference "+circumference);
	}

}
