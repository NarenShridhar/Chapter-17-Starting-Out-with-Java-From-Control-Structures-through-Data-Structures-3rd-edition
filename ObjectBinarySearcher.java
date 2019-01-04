import java.util.Scanner;
public class ObjectBinarySearcher
{
	/*
		The search method performs a binary search on a Comparable array. The array is searched for the String passed to
		userValue. If the String is found, its array subscript is returned. Otherwise, -1 is returned indicating the
		userValue was not found in the array.
		The first @param the he array to search.
		The second @param is the value to search for.
	*/

	public static int search(Comparable[] userArray, Comparable userValue)
	{
		// The first array element.
		int first;

		// The last array element.
		int last;

		// Th mid point of search.
		int middle;

		// The position of search value.
		int position;

		// Flag
		boolean found;

		// Set the initial values.
		first = 0;
		last = userArray.length - 1;
		position = -1;
		found = false;

		// Search for the value.
		while(!found && first <= last)
		{
			// Calculate the midpoint.
			middle = (first + last)/2;

			// If the array is found at midpoint
			if(userArray[middle].compareTo(userValue) == 0)
			{
				found = true;
				position = middle;
			}

			// Else if the value is in the lower half
			else if(userArray[middle].compareTo(userValue) > 0)
			{
				last = middle - 1;
			}

			// Else the value is in the upper half
			else
			{
				last = middle + 1;
			}
		}

		// Return the position of the item, or -1 if it was not found.
		return position;
	}
}