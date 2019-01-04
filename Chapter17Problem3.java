import java.util.Scanner;
import java.io.*;

public class Chapter17Problem3
{
	public static void main (String[] args) throws IOException
	{
		/*
			Created an integer variable result to hold the value of the position that will be returned 
			from the ObjectBinarySearcher.search() method call. 
		*/

		int result; 

		// String variable to hold the user's input for what to search for in the array
		String searchValue;

		// Char variable to determine whether the user will want to search the array again using the binary search method.
		char repeat;

		// Created an array of String objects with test values called testArray
		String[] testArray = {"David", "Abe", "Katherine", "Daisy"}	;

		// Created a Scanner object called keyboard for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// First I will sort the array in ascending order. Remember, binary search will not work unless the array is sorted.
		ObjectInsertionSorter.insertionSort(testArray);

		System.out.println("\nSorted order: ");

		for(String element: testArray)
		{
			System.out.println(element + " ");
		}

		System.out.println();

		do
		{
			// Get a value to search for.
			System.out.println("Please enter a name to search for: ");
			searchValue = keyboard.nextLine();

			result = ObjectBinarySearcher.search(testArray, searchValue);

			// Display the results
			if(result == -1)
			{
				System.out.println(searchValue + " was not found.");
			}

			else
			{
				System.out.println(searchValue + " was found at position " + result);
			}

			// Consume the remaining newline...
			// keyboard.nextLine();


			// Ask the user if they want to search again?
			System.out.println("Do you want to search again?");
			System.out.println("Type 'Y' or 'y' to do so, anything else to quit");
			repeat = keyboard.nextLine().charAt(0);
		} while(repeat == 'Y' || repeat == 'y');
	}
}