package training.algs.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibbonachiTest {

    @Test
    void getNthFib() {
        int nthFib = Fibbonachi.getNthFib(7);
        Assertions.assertEquals(8, nthFib);
    }
}