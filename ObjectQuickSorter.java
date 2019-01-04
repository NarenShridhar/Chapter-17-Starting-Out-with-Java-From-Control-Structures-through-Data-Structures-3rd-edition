public class ObjectQuickSorter
{
	/*
		The quickSort method calls the doQuickSort method by providing the array, minimum, and maximum indexes of the array. 
		The first @param is array to be sorted. 
		The second @param will always be 0, because the first element of any array is 0. 
		The third @param will always be the array's length - 1, since that is always the maximum.
		Note, this is the public method that will be called in the main method class. 
	*/

		public static void quickSort(Comparable[] userArray)
		{
			doQuickSort(userArray, 0, userArray.length - 1);
		}

	/*
		The doQuickSort method sorts the array elements provided by quickSort. It partitions the array by calling the parition
		method and sorts the sublists recursively. It uses the divide and conquer concept. 
		The first @param is the array to sort. 
		The second @param is the starting subscript of the array. 
		The third @param is the ending subscript of the array.
		Note, this method can be private because it will ultimately be called in a public method.
		Notice also that this method recursively calls itself to sort the array.
	*/

		private static void doQuickSort(Comparable[] userArray, int start, int end)
		{
			// Will hold the pivotPoint element.
			int pivotPoint;

			// If the starting element is less than the ending element (which is should be until the array is sorted).
			if(start < end)
			{
				// Get the pivotpoint
				pivotPoint = partition(userArray, start, end);

				// Sort the first sublist. Method recursively calls itself. 
				doQuickSort(userArray, start, pivotPoint - 1);

				// Sort the second sublist. Method recursively calls itself. 
				doQuickSort(userArray, pivotPoint + 1, end);
		}
			}

			

	/*
		The partition method selects a pivot value in the array and arranges the array into two sub lists. All the values less than
		the pivot will be stored in the left sub list and all the values greater than or equal to the pivot will be stored in the right
		sublist. 
		The first @param is the array to partition.
		The second @param is the starting subscript of the area to partition.
		The third @param is the ending subscript of the area to partition.
		The @return statement returns the subscript of the pivot value.
		Note, this method can be private because it will ultimately be called in a public method
	*/

	private static int partition(Comparable[] userArray, int start, int end)
	{
		// pivotValue variable holds the pivot value
		Comparable pivotValue;

		// endOfLeftList holds the last element in the left sublist
		int endOfLeftList;

		// middle holds the mid-point subscript
		int middle;

		/* 
			The subscript of the middle element is found by taking the start + end subscripts and diving by 2. This is the pivot value.
			It is important that I recognize that this is NOT the middle value, instead, it is the middle ELEMENT! The value could be anything.
			The point is that the values for the array will be sorted to the left or right of this middle element after it has been moved
			to the start of the list in the next steps.  

		*/
		middle = (start + end)/2;

		// Call the swap method to swap the middle element with the first element. This moves the pivot value to the start of the list.
		swap(userArray, start, middle);

		// Save the pivotValue for comparison.
		pivotValue = userArray[start];

		// For now, the end of the lift sublist is the first element,
		endOfLeftList = start;

		// Scan the entire list and move any values that are less than the pivotValue to the left of the sublist
		for(int scan = start + 1; scan <= end; scan++)
		{
			/*
				If the value at the current elmement of the array (while scanning) compares to the pivotValue, and is less than 0, this means
				that the value is less than the pivotValue, and should be moved to the left of the pivotValue (which has been moved to element 0)
				before this scan begins. 
			*/

			if(userArray[scan].compareTo(pivotValue) < 0)
			{
				// Each time this for loop runs and finds a value lower than the pivotValue, the end of the left list increments.
				endOfLeftList++;
			}
		}

		// Move the pivot value to the end of the left sublist. 
		swap(userArray, start, endOfLeftList);

		// Return the subscript of the pivot value.
		return endOfLeftList;
	}

	/*
		The swap method swaps the contents of two elements in (in this case a Comparable), array. 
		The first @param is the array that must be sorted. 
		The second @param is the subcript of the value to be swapped.
		The third @param is also the subscript of the value to be swapped.
		Note, this method can be private because it will ultimately be called in a public method
	*/

	private static void swap(Comparable[] userArray, int subscriptA, int subscriptB)
	{
		/* 
			This variable serves to temporarily hold the value of the first subscript, and to then transfer the value to the second
			after the swap occurs. 
		*/

		Comparable temporaryValueHolder;

		// Assign the value of the temp value to the value of the userArray at subscriptA
		temporaryValueHolder = userArray[subscriptA];

		// Change the value of the array at subcriptA (which is now stored in the temp variable) to the value of the array at subcscriptB
		userArray[subscriptA] = userArray[subscriptB];

		// Change the value of the array at subscriptB to the old value at subscriptA, which is stored in the temp variable
		userArray[subscriptB] = temporaryValueHolder;
	}
}