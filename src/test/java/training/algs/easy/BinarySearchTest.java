package training.algs.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void binarySearch() {
        int index = BinarySearch.binarySearch(new int[]{1, 3, 7, 9}, 7);
        Assertions.assertEquals(2, index);
    }
}