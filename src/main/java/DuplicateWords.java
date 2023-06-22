import java.util.Scanner;


public class DuplicateWords
{

	public static void main(String[] args)
	{
		final Scanner in = new Scanner(System.in);
		final int amount = in.nextInt();
		for (int i = 0; i < amount; i++)
		{
			final String sentence = in.nextLine();
			final String output = sentence.replaceAll("(?i)\\b(\\w+)(\\s+\\1)+\\b", "$1");
			System.out.println(output);
		}
	}
}
