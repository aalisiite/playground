import java.util.*;
import java.io.*;
import java.math.*;


public class MiddleElement
{
	public static void main(String args[])
	{
		final Scanner in = new Scanner(System.in);
		final String strings = in.nextLine();
		final String[] array = strings.split(" ");
		final int length = array.length;
		String word = "";
		if (length % 2 == 0)
		{
			final int i = length / 2;
			word = array[i - 1] + array[i];
		}
		else
		{
			final int i = length / 2;
			word = array[i];
		}

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.err.println(strings);
		System.out.println(word);
	}
}
