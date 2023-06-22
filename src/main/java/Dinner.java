import java.util.ArrayList;


public class Dinner
{
	protected int getCustomersPayForTheFood(final int tablesAvailable, final int[] payableCus, final int[] movements)
	{
		var moneyGain = 0;
		final var waitingList = new ArrayList<Integer>();
		final var atTheTable = new ArrayList<Integer>();
		//improve  this method by using a hashmap to store customer id and their position in the array
		//so that we can quickly find the customer when he/she has arrived and then remove him from the waiting list
		//and add him to the table
		for (final int customerId : movements)
		{
			if (waitingList.contains(customerId))
			{
				waitingList.remove(Integer.valueOf(customerId));
				continue;
			}

			var hasArrived = !atTheTable.contains(customerId);
			if (hasArrived && atTheTable.size() < tablesAvailable)
			{
				atTheTable.add(customerId);
			}
			else if (hasArrived)
			{
				waitingList.add(customerId);
			}
			else
			{
				moneyGain += payableCus[customerId];
				atTheTable.remove(Integer.valueOf(customerId));
				removeCustomerFromWaitingListWhenSeatFound(waitingList, atTheTable);
			}
		}
		return moneyGain;
	}

	private void removeCustomerFromWaitingListWhenSeatFound(final ArrayList<Integer> waitingList,
			final ArrayList<Integer> atTheTable)
	{
		if (!waitingList.isEmpty())
		{
			final var customerFromWaitList = waitingList.get(0);
			waitingList.remove(0);
			atTheTable.add(customerFromWaitList);
		}
	}
}
