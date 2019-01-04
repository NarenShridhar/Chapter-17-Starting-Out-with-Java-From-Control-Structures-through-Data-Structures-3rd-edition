import java.util.Scanner;

public class Chapter17Problem7
{
   public static boolean seqSearch(int[] array, int value)
   {
      int index;
      boolean found;
      int seqCounter = 0;
      index = 0;
      found = false;
   
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
             seqCounter++;
       	    index++;
         }
      }
   
      return found;
   }

   public static boolean binSearch(int[] array, int value)
   {
      IntInsertionSorter.insertionSort(array);

      int first;
      int last;
      int middle;
      boolean found;
      int binCounter;
      
      
      first = 0;
      last = array.length - 1;
      binCounter = 0;
      found = false;
      
      while (!found && first <= last)
      {
         middle = (first + last)/2;
         
         if (array[middle] == value)
         {
            found = true;
            binCounter++;
         }
         
         else if (array[middle] > value)
         {
            last = middle - 1;
            binCounter++;
         }
         
         else
         {
            first = middle + 1;
            binCounter++;
         }
      }
      
      return found;
   }

		// Created an integer array of 20 integers. 
		public static int[] array = {15, 25, 10, 19, 28, 95, 64, 72, 45, 61, 83, 35, 87, 39, 84, 27, 64, 37, 10, 20};

		// Created an integer variable called seqCounter to measure the comparisions of the sequential search
		public static int seqCounter;

		// Created an integer variable called binCounter to measure the comparisions of the binary search
		public static int binCounter;


	public static void main (String[] args)
	{


		// Created an integer variable called userNumber to hold the number the user is looking for
		int userNumber;

		// Created a char variable called repeat to hold the user's input on whether to repeat the program or not
		char repeat = 'y';

		// Created a boolean variable found to determine whether the number was found or not.
		boolean found;

		// Created a Scanner object called keyboard to take in the user's input
		Scanner keyboard = new Scanner(System.in);

		// while loop serves to determine whether the user wants to repeat the search or not
		while(repeat == 'y' || repeat == 'Y')
		{
			System.out.println("User, what is the value you want to search for?");
			userNumber = keyboard.nextInt();

			found = seqSearch(array, userNumber);
			if(!binSearch(array, userNumber))
			{
				System.out.println(userNumber + " is not found.");
				System.out.println("Comparisons done by Sequential search: " + seqCounter);
				System.out.println("Comparisons done by Binary search: " + binCounter);
			}

			else
			{
				System.out.println(userNumber + " is found");
				System.out.println("Comparisons done by Sequential search: " + seqCounter);
				System.out.println("Comparisons done by Binary search: " + binCounter);
			}

			System.out.println("Do you want to enter another number? Type 'y' or 'n'");
			keyboard.nextLine();
			repeat = keyboard.nextLine().charAt(0);

		}
	}
}