package training.algs.easy;

public class BinarySearch {

    /**
     * Binary search function should determine
     * if the target is contained in the array or should return -1 if no target found
     *
     * @param array sorted array
     * @param target searching number
     * @return target's index or -1 if no result found
     */
    public static int binarySearch(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        if (target > array[rightIndex] || target < array[leftIndex]) {
            return -1;
        }
        while (rightIndex >= leftIndex) {
            int newIndex = (rightIndex + leftIndex) / 2;
            if (array[newIndex] == target) {
                return newIndex;
            }
            if (array[newIndex] > target) {
                rightIndex = newIndex - 1;
                continue;
            }
            if (array[newIndex] < target) {
                leftIndex = newIndex + 1;
            }
        }
        return -1;
    }
}
