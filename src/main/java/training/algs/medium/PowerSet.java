package training.algs.medium;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    // O(n*2^n) time and same space
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (Integer integer : array) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(res.get(i));
                temp.add(integer);
                res.add(temp);
            }
        }
        return res;
    }
}
