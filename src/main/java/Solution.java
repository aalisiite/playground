import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;


class Solution
{
	public static int computeClosestToZero(int[] ts)
	{
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		if (ts.length == 0)
		{
			return 0;
		}

		if (ts.length == 1)
		{
			return ts[0];
		}

		int closestNumber = ts[0];
		boolean isNegative = Arrays.stream(ts).allMatch(i -> i < 0);
		for (final int t : ts)
		{
			if (Math.abs(t) == Math.abs(closestNumber) && isNegative)
			{
				closestNumber = t;
			}
			else if (Math.abs(t) == Math.abs(closestNumber))
			{
				closestNumber = Math.abs(t);
			}
			else if (Math.abs(t) < Math.abs(closestNumber))
			{
				closestNumber = t;
			}
		}

		return closestNumber;
	}

	/* Ignore and do not change the code below */
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ts = new int[n];
		for (int i = 0; i < n; i++)
		{
			ts[i] = in.nextInt();
		}
		PrintStream outStream = System.out;
		System.setOut(System.err);
		int solution = computeClosestToZero(ts);
		System.setOut(outStream);
		System.out.println(solution);
	}
	/* Ignore and do not change the code above */
}
