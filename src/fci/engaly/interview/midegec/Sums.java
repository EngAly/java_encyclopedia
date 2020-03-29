package fci.engaly.interview.midegec;

import java.util.Arrays;

public class Sums {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sumArrIs0()));
	}

	/**
	 * Objective: Given an integer N, write a function to return an array containing
	 * N unique integers that sum up to zero. There are many possible arrays that
	 * sum up to 0 for any N, you need to return any one of such arrays. Example:
	 * 
	 * N = 4 Output: [-1, 1, -2, 2] or [-1, -2, 3, 0] or [-2, -4, 5, 1] or any other
	 * such array that sum to 0.
	 * 
	 * N = 3 Output: [-2, -1, 3] or [-1, 0, 1] or [-2, 0, 2] or any other such array
	 * that sum to 0.
	 * 
	 * Note: [2, -1, -1] is not valid output since -1 appears twice sol array
	 * elements are not unique.<br>
	 * 
	 * Approach: As mentioned, there could be more than one correct answer but we
	 * need to return any one of those so we will construct the one which is easiest
	 * to form-
	 * 
	 * Include numbers from -N/2 to +N/2 in our result array without 0. Check if N
	 * is even or odd. If N is even then does not include 0 in the array and if N is
	 * odd then include 0 in the array.
	 * 
	 * Example if N = 4 then result array would be [-2, -1, 1, -2] where as if N = 5
	 * then result would be [-2, -1, 0, 1, 2].
	 * 
	 * Time Complexity: O(N)
	 * 
	 * @return
	 */
	public static int[] sumArrIs0() {
		int N = 7;
		int[] numbers = new int[N];
		int i = 0;
		int counter = 1;
// append zero if N is odd
		if (N % 2 != 0) {
			numbers[0] = 0;
//			make the start after appended zero to index 1
			i = 1;
		}
		for (int index = i; index <= N - 1; index++) {
			numbers[index] = counter;
//			increase counter by 1
			numbers[++index] = -(counter++);
		}
		return numbers;
	}
}
