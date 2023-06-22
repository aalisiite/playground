import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CorrectOrder
{
	public static void main(String[] args)
	{
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt();
		System.err.println(n);
		String name = "";
		String parent = "";
		int birth = 0;
		String gender = "";
		String[] names = new String[n];
		for (int i = 0; i < n; i++)
		{
			String currentName = in.next();
			String currentParent = in.next();
			int currentBirth = in.nextInt();
			String death = in.next();
			String religion = in.next();
			String currentGender = in.next();

			final String x =
					currentName + " " + currentParent + " " + currentBirth + " " + death + " " + religion + " " + currentGender;
			if (currentName.equals("PrinceEdwardEarlofWessex")){
				System.err.println(x);
			}

			if (currentName.equals("PrinceAndrewDukeofYork")){
				System.err.println(x);
			}

			if (death.equals("-") && !religion.equals("catholic"))
			{
				if (currentParent.equals(name)){
					names[i] = currentName;
				}
				else if (currentParent.equals(parent) && currentGender.equals("M")
						&& gender.equals("F")) {

					names[i - 1] = currentName;
					names[i] = name;
				}
//				else if (currentParent.equals(parent) && currentBirth < birth
//						&& currentGender.equals("M") && gender.equals("F")) {
//					names[i - 1] = currentName;
//					names[i] = name;
//				}
				else
				{
					names[i] = currentName;
				}

				name = currentName;
				parent = currentParent;
				birth = currentBirth;
				gender = currentGender;
			}
		}

		List<String> list = new ArrayList<>();
		for (String s : names)
		{
			if (s != null && s.length() > 0)
			{
				list.add(s);
			}
		}

		names = list.toArray(new String[0]);
		for (final String nm : names)
		{
			System.out.println(nm);
		}

	}
}
