package training.algs.medium;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {

    @Test
    void powerset() {
        List<List<Integer>> powerset = PowerSet.powerset(List.of(1, 2, 3));
        Assertions.assertEquals(8, powerset.size());
    }
}