package day1;
import java.util.*;
public class Power {
	public static void main(String [] args)
	{
		int n, pow, c = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		pow = sc.nextInt();
		while (pow != 0) 
		{
		      c *= n;
		      --pow;
		}
		System.out.println(c);
	}
}