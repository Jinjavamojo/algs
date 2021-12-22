 package training.algs.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PermutationsTest {

    @Test
    void getPermutations1() {
        List<List<Integer>> permutations = Permutations.getPermutations1(List.of(1, 2, 3, 4));
        Assertions.assertEquals(24, permutations.size());
    }

    @Test
    void getPermutations2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<List<Integer>> permutations = Permutations.getPermutations2(list);
        Assertions.assertEquals(24, permutations.size());
    }
}