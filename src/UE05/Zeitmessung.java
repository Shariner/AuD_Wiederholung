package UE05;
public class Zeitmessung
{
	private static double tuwas()
	{
		return Math.random();
	}

	// Linear
	public static double func1(int n)
	{
		double summe = 0;

		for (int a = 0; a < n; a++)
			summe += tuwas();

		return summe;
	}

	// Quadratisch
	public static double func2(int n)
	{
		double summe = 0;

		for (int a = 0; a < n; a++)
			for(int b = 0; b < n; b++)
				summe += tuwas();

		return summe;
	}

	// log2(n)
	public static double func6(int n)
	{
		double summe = 0;

		while (n > 0)
		{
			summe += tuwas();
			n /= 2;
		}

		return summe;
	}

	public static void main(String[] args)
	{
		// TODO
	}
}
