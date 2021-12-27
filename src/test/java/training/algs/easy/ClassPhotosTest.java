package training.algs.easy;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassPhotosTest {

    @org.junit.jupiter.api.Test
    public void TestCase1() {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));
        Assertions.assertTrue(ClassPhotos.classPhotos(redShirtHeights, blueShirtHeights));
    }
}