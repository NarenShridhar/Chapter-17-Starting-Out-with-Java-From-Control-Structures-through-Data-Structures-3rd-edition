public class Chapter17Problem1
{
	public static void main (String[] args)
	{
		// Created an array of String objects with test values called testArray
		String[] testArray = {"Ranjini", "Shridhar", "Sudha", "Srinivas", "Vivek", "Aashish", "Naren", "Meera", "Shaureya", "Afrand", 
							  "Henzhi", "Chintu", "Pintu", "Chandru", "Baba"};

		// Display the original order
		System.out.println("\nOrginal Order: ");

		for(String element : testArray)
		{
			System.out.println(element + " ");
		}

		// Sort the array using the insertionSort method in the ObjectInsertionSorter class
		ObjectInsertionSorter.insertionSort(testArray);

		// Display the sorted contents
		System.out.println("\nSorted order: ");

		for(String element: testArray)
		{
			System.out.println(element + " ");
		}

		System.out.println();
	}
}