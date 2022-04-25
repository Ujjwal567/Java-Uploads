package Exesice;

public class MissingElementArra {
	static void findMissing(int a[], int b[],
            int c, int d)
					{
				for (int i = 0; i < c; i++)
				{
				int j;

				for (j = 0; j < d; j++)
				if (a[i] == b[j])
				break;

				if (j == d)
System.out.print(a[i] + " ");
}
}


	public static void main(String[] args)
	{
		int a[] = { 1, 2, 6, 3, 4, 5 };
		int b[] = { 2, 4, 3, 1, 0 };

		int c = a.length;
		int d = b.length;

		findMissing(a, b, c, d);
	}

}
