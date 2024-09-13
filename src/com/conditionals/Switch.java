package com.conditionals;

public class Switch {
public static void main(String[] args) {
	int mon=6;
	switch(mon) {
	case 1: System.out.println("jan");
	break;
	case 2: System.out.println("feb");
	break;
	case 3: System.out.println("mar");
	break;
	case 4: System.out.println("apr");
	break;
	case 5: System.out.println("may");
	break;
	case 6: System.out.println("jun");
	break;
	default:System.out.println("invalid");
	}
	
	String week="ff";
	switch(week) {
	case "mo": System.out.println("monday");
	break;
	case "tu": System.out.println("tuesday");
	break;
	case "wed": System.out.println("wednesday");
	break;
	case "thu": System.out.println("thursday");
	break;
	case "fri": System.out.println("friday");
	break;
	case "sat": System.out.println("saturday");
	break;
	default:System.out.println("invalid");
	
	}
	
	
}
}
