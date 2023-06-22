import java.util.*;
import java.util.regex.Pattern;


public class Car
{
	public static void main(String[] args)
	{
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		final Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine())
		{
			final String ipAddress = scanner.next();
			boolean isValid = true;
			final boolean startsOrEndsWithSymbol = ipAddress.startsWith(".") || ipAddress.endsWith(".");
			final String[] numbers = ipAddress.split("\\.");
			final boolean correctLength = Arrays.stream(numbers).allMatch(i -> i.length() <= 3);
			final boolean incorrectLength = numbers.length != 4;
			final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
			final boolean containsNumbers = Arrays.stream(numbers).allMatch(i -> pattern.matcher(i).matches());
			if (startsOrEndsWithSymbol || incorrectLength || !correctLength || !containsNumbers)
			{
				isValid = false;
			}
			else if (containsNumbers)
			{
				for (final String number : numbers)
				{
					final int num = Integer.parseInt(number);
					if (num < 0 || num > 255)
					{
						isValid = false;
					}
				}
			}
			System.out.println(isValid);
		}
	}
}
