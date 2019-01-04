public class ObjectInsertionSorter
{
	// Created a static void method called insertionSort to help sort an array, userArray, of comparable objects.
	public static void insertionSort(Comparable[] userArray)
	{
		// Created a comparable variable called unsortedValue to hold the first unsorted value.
		Comparable unsortedValue;

		// Created an integer variable called scan to scan the userArray.
		int scan;

		/*
			The outer loop steps the index variable through each subscript in the userArray, starting at 1. The portion of
			the userArray containing element 0  by itself is already sorted.
		*/

		for(int index = 1; index < userArray.length; index++)
		{
			// The first element outside the sorted portion is userArray[index]. Store the value of this element in unsortedValue.
			unsortedValue = userArray[index];

			// Start scan at the subscript of the first element outside the unsorted part.
			scan = index;

			// Move the first element in the still unsorted part into its proper position in the sorted part.
			while(scan > 0 && userArray[scan - 1].compareTo(unsortedValue) > 0)
			{
				userArray[scan] = userArray[scan - 1];
				scan--;
			}

			// Insert the unsorted value in its proper position within the sorted subset
			userArray[scan] = unsortedValue;
		}
	}
}