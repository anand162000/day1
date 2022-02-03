package day1;
import java.util.*;
public class LeapYear 
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a%4 == 0)
			System.out.println("The given year is a leap year");
		else
			System.out.println("The year is not leap");
	}
}