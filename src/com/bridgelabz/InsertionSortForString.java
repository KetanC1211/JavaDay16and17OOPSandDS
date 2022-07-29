package com.bridgelabz;

public class InsertionSortForString {
	// Java program for implementation of Insertion Sort

		/*Function to sort array using insertion sort*/
		void sort(String arr[]) {
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				String key = arr[i];
				int j = i - 1;

				while (j >= 0 && (arr[j].compareTo(key))>0) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}

		/* A utility function to print array of size n*/
		static void printArray(String arr[]) {
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		// Driver method
		public static void main(String args[]) {
			String arr[] = {"ketan", "ankit", "bhavesh", "yogesh", "deepak" };
			InsertionSortForString obj = new InsertionSortForString();
			obj.sort(arr);
			printArray(arr);
		}
}
