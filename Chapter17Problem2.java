public class Chapter17Problem2
{
	public static void main (String[] args)
	{
		// Created an array of String objects with test values called testArray
		String[] testArray = {"Naren", "Shridhar", "Aashish", "Sudha", "Ranjini", "Uma", "Usha"};

		// Display the original order.
		System.out.println("\nOrginal Order: ");

		for(String element : testArray)
		{
			System.out.println(element + " ");
		}

		// Sort the array using the quickSort method in the ObjectQuickSorter class
		ObjectQuickSorter.quickSort(testArray);

		// Display the sorted contents
		System.out.println("\nSorted order: ");

		for(String element: testArray)
		{
			System.out.println(element + " ");
		}

		System.out.println();
	}
}