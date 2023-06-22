import java.util.Arrays;
import java.util.List;


public class Main
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Sequential stream
		int sumSequential = numbers.stream()
				.reduce(5, Integer::sum);
		System.out.println("Sequential sum: " + sumSequential);

		// Parallel stream
		int sumParallel = numbers.parallelStream()
				.reduce(5, Integer::sum);
		System.out.println("Parallel sum: " + sumParallel);
	}
}
