import java.util.*;
import java.io.*;
import java.math.*;


public class SumEvenNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 0;
		for (int i = 0; i < number; i++)
		{
			final int num = i + 1;
			if (num % 2 == 0)
			{
				sum += num;
			}
		}

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.err.println(number);
		System.out.println(sum);
	}
}
