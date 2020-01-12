 
package fci.engaly.arrays; 
public class ArrSorter {
    /**
     * sort array ascending Numbers are said to be in ascending order when they
     * are arranged from the <b style="color:blue">smallest to the largest</b>
     *
     * @param arr2sort : for test use new int[]{3, 2, 4, 5, 3, 4, -1, -2, -1, 2,
     * 3, 4, -3, -3}
     * @return
     */
    public static int[] sortArrAscending(int[] arr2sort) {
        int temp;
        for (int i = 0; i < arr2sort.length; i++) {
            for (int j = i; j < arr2sort.length; j++) {
                if (arr2sort[i] > arr2sort[j]) {
                    temp = arr2sort[i];
                    arr2sort[i] = arr2sort[j];
                    arr2sort[j] = temp;
                }
            }
        }
        return arr2sort;
    }

    /**
     * sort array <b style="color:blue">descending</b> Numbers are said to be in
     * ascending order when they are arranged from the
     * <b style="color:blue">largest to the smallest</b>
     *
     * @param arr2sort : for test use new int[]{3, 2, 4, 5, 3, 4, -1, -2, -1, 2,
     * 3, 4, -3, -3}
     * @return
     */
    public static int[] sortArrDescending(int[] arr2sort) {
        int temp;
        for (int i = 0; i < arr2sort.length; i++) {
            for (int j = i; j < arr2sort.length; j++) {
                if (arr2sort[i] < arr2sort[j]) {
                    temp = arr2sort[i];
                    arr2sort[i] = arr2sort[j];
                    arr2sort[j] = temp;
                }
            }
        }
        return arr2sort;
    }

    /**
     * sort array with fix negative values example
     * Arrays.toString(sortwithFixedNegative(new int[]
     * {4,3,-3,3,7,1,6,-5,3,22,-4,3,-55}))
     *
     * @param arr2sort
     * @return
     */
    public static int[] sortwithFixedNegative(int[] arr2sort) {
        int temp;
        for (int i = 0; i < arr2sort.length; i++) {
            if (arr2sort[i] < 0) {
                continue;
            }
            for (int j = 0; j < arr2sort.length; j++) {
                if (arr2sort[j] < 0) {
                } else if (arr2sort[i] < arr2sort[j]) {
                    temp = arr2sort[i];
                    arr2sort[i] = arr2sort[j];
                    arr2sort[j] = temp;
                }
            }

        }
        return arr2sort;
    }
}
