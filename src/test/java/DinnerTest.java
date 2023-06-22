import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class DinnerTest
{
	private final Dinner dinner = new Dinner();

	@Test
	public void shouldCalculateAllLeftCustomersPay()
	{
		final int[] payableCus1 = { 25, 10, 5, 30, 15 };
		final int[] movements1 = { 4, 4, 3, 2, 3, 0, 0, 2 };
		final int payForTheFood = dinner.getCustomersPayForTheFood(5, payableCus1, movements1);
		Assertions.assertEquals(payForTheFood, 75);
	}

	@Test
	public void shouldCalculatePayWhenCustomersMoreThanSeats()
	{
		final int[] payableCus1 = { 25, 10, 5, 30, 15, 20, 22 };
		final int[] movements1 = { 4, 3, 2, 1, 0, 5, 2, 4, 3, 1, 0, 5 };
		final int payForTheFood = dinner.getCustomersPayForTheFood(3, payableCus1, movements1);
		Assertions.assertEquals(payForTheFood, 105);
	}

	@Test
	public void shouldCalculatePayWhenCustomerComesTwice()
	{
		final int[] payableCus1 = { 25, 10, 5, 30, 15 };
		final int[] movements1 = { 4, 4, 3, 2, 4, 3, 0, 0, 2, 4 };
		final int payForTheFood = dinner.getCustomersPayForTheFood(3, payableCus1, movements1);
		Assertions.assertEquals(payForTheFood, 90);
	}

	@Test
	public void shouldCalculatePayWhenCustomerComesTwiceAndTheyAreMoreThanSeats()
	{
		final int[] payableCus1 = { 25, 10, 5, 30, 15, 20 };
		final int[] movements1 = { 4, 3, 2, 1, 0, 5, 2, 4, 3, 1, 0, 5, 0, 0 };
		final int payForTheFood = dinner.getCustomersPayForTheFood(3, payableCus1, movements1);
		Assertions.assertEquals(payForTheFood, 130);
	}

	@Test
	public void shouldCalculatePayWhenCustomerComesAndLeavesFromWaitingList()
	{
		final int[] payableCus1 = { 25, 10, 5, 30, 15, 20 };
		final int[] movements1 = { 4, 3, 2, 1, 0, 0, 5, 2, 0, 4, 3, 1, 5, 0 };
		final int payForTheFood = dinner.getCustomersPayForTheFood(3, payableCus1, movements1);
		Assertions.assertEquals(payForTheFood, 105);
	}
}
