package training.algs.easy.sort;

public class BubbleSort {

    /**
     * Sorting array by classic bubble sort algorithm
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        int counter = 0;
        while (true) {
            boolean arrayChanged = false;
            for (int i = 0; i < array.length - counter; i++) {
                if (i + 1 < array.length && array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    arrayChanged = true;
                }
            }
            counter++;
            if (!arrayChanged) {
                break;
            }
        }
        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
