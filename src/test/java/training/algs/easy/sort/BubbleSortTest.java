package training.algs.easy.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] ints = BubbleSort.bubbleSort(new int[]{10, 8, 7, 6, 3, 1});
        for (int i = 0; i < ints.length; i++) {
            if (i + 1 < ints.length) {
                Assertions.assertTrue(ints[i] <= ints[i + 1]);
            }
        }
    }
}