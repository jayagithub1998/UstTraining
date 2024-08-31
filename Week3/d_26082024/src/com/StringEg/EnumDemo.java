package com.StringEg;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
};

public class EnumDemo {

Day day = Day.MONDAY;

public static void main(String[] a) {

	Day today = Day.WEDNESDAY;
	printWeekend(today);
}

// an enum type can be used as local variable, parameter
static public void printWeekend(Day today) {
	if (today == Day.SATURDAY) {
		System.out.println("It's Weekend, Saturday");
	} else if (today == Day.SUNDAY) {
		System.out.println("It's Weekend, Sunday");
	} else {
		System.out.println("It's not Weekend");
	}
	
	/*Switch Case
	switch(today) {
	case MONDAY:
		System.out.println("Today is Monday");
		break;
	case TUESDAY:
		System.out.println("Today is Tuesday");
		break;
	default:
		System.out.println("Today is not Monday and Tuesday");
	}
	*/
}

//an enum type can be used as return type
Day getSunday() {
	return Day.SUNDAY;
}
}
