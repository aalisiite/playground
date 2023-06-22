import java.util.Scanner;


public class Factorial
{
	private static final String TOKEN = "3ujhg89FGA";

	public static void main(String[] args)
	{
		final Scanner s = new Scanner(System.in);
		final int result = firstFactorial(s.nextInt());
		System.out.println(appendToken(result, TOKEN));
	}

	private static int firstFactorial(int num)
	{
		int result = 1;
		for (int i = 1; i <= num; i++)
		{
			result *= i;
		}
		return result;
	}

	private static String appendToken(int num, final String token)
	{
		final StringBuilder sb = new StringBuilder(num + token);
		for (int i = 3; i < sb.length(); i += 4)
		{
			sb.setCharAt(i, '_');
		}
		return sb.toString();
	}
}
