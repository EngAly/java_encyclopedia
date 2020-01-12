package fci.engaly.arrays;

public class ArrOperations {

    /**
     * get max value from passed array to your methods
     *
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * get min value from passed array to your method
     *
     * @param arr
     * @return
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * get second max number in passed array.
     *
     * @param arr
     * @return
     */
    public static int getSecondMax(int[] arr) {
        int max = arr[0], secodMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secodMax = max;
                max = arr[i];
            } else if (arr[i] > secodMax) {
                secodMax = arr[i];
            }
        }
        return secodMax;
    }

    /**
     * get count of non repeated number in array
     *
     * @param arr
     * @return
     */
    public static int getDiffNumbersCount(int[] arr) {
        int count = 0;
        int[] r = ArrSorter.sortArrAscending(arr);
        for (int i = 0; i < r.length - 1; i++) {
            if (r[i] - r[i + 1] != 0) {
                count++;
            }
        }
        return ++count;
    }

    public static void main(String[] args) {
        int r = getDiffNumbersCount(new int[]{1,2,3,4,5,6,7,7,7,8,8,8,9,8});
//        System.out.println(Arrays.toString(r));
        System.out.println((r));
    }
}
