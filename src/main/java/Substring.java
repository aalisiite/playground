import java.util.*;
import java.io.*;
import java.math.*;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Substring
{

	public static void main(final String[] args)
	{
		final Scanner in = new Scanner(System.in);
		final String substring = in.nextLine();
		final String text = in.nextLine();
		final String[] strings = text.split(" ");
		int count = 0;
		for (final String word : strings)
		{
			if (word.toLowerCase().contains(substring.toLowerCase()))
			{
				count++;
			}
		}

		System.out.println(count);
		System.err.println();
	}
}
