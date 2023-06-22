import java.util.Scanner;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Pangram
{

	public static void main(String args[])
	{
		final Scanner in = new Scanner(System.in);
		final String string = in.nextLine();
		final int len = string.length();

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(allLetter(string, len));
	}

	static boolean allLetter(String str, final int len)
	{
		final int size = 26;
		// Convert the given string
		// into lowercase
		str = str.toLowerCase();

		// Create a frequency array to
		// mark the present letters
		boolean[] present = new boolean[size];

		// Traverse for each character
		// of the string
		for (int i = 0; i < len; i++)
		{

			// If the current character
			// is a letter
			if (isLetter(str.charAt(i)))
			{

				// Mark current letter as present
				int letter = str.charAt(i) - 'a';
				present[letter] = true;
			}
		}

		// Traverse for every letter
		// from a to z
		for (int i = 0; i < size; i++)
		{

			// If the current character
			// is not present in string
			// then return false,
			// otherwise return true
			if (!present[i])
			{
				return false;
			}
		}
		return true;
	}

	static boolean isLetter(char ch)
	{
		return Character.isLetter(ch);
	}
}
