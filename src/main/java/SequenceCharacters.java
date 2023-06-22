import java.util.Scanner;


public class SequenceCharacters
{
	public static void main(String args[])
	{
		final Scanner in = new Scanner(System.in);
		final String ch = in.nextLine();
		final String text = in.nextLine();
		final String[] strings = text.split(" ");
		int count = 0;
		for (final String word : strings)
		{
			for ( int i = 0; i < word.length(); i++) {
				//if (word.charAt(i) == ch) count++;
			}
			System.out.println(count);
		}

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.err.println(ch + " and " + text);
		System.out.println("answer");
	}
}
