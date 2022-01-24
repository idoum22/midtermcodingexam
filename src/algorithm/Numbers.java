package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {

	public static void main(String[] args) throws Exception {

		int[] num = new int[200];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " nano sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		ArrayList<String> numbers = (ArrayList<String>) connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");

		int n = num.length;

		randomize(num, n);

		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " nano sec");

		randomize(num, n);

		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " nano sec");

	}

	public static void storeRandomNumbers(int[] num) {
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize(int arr[], int n) {
		Random r = new Random();

		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void printValue(ArrayList<String> array) {
		for (String st : array) {
			System.out.println(st);
		}
	}
}