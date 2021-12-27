package training.algs.medium;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Permutations {

    // O(n^2*n!) time
    public static List<List<Integer>> getPermutations1(List<Integer> list) {
        List<List<Integer>> perms = new ArrayList<List<Integer>>();
        getPermutations1(list, new ArrayList<Integer>(), perms);
        return perms;
    }

    public static void getPermutations1(List<Integer> array, List<Integer> currentPerm, List<List<Integer>> perms) {
        if (array.size() == 0 && currentPerm.size() > 0) {
            perms.add(currentPerm);
        } else {
            for (int i = 0; i < array.size(); i++) {
                List<Integer> newArray = new ArrayList<>(array);
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList<>(currentPerm);
                newPermutation.add(array.get(i));
                getPermutations1(newArray, newPermutation, perms);
            }
        }
    }

    // O(n*n!) time
    public static List<List<Integer>> getPermutations2(List<Integer> list) {
        List<List<Integer>> perms = new ArrayList<List<Integer>>();
        getPermutations2(0, list, perms);
        return perms;
    }

    public static void getPermutations2(int i, List<Integer> array, List<List<Integer>> perms) {
        if (i == array.size() - 1) {
            perms.add(new ArrayList<>(array));
        } else {
            for (int j = i; j < array.size(); j++) {
                swap(array, i, j);
                getPermutations2(i+1, array, perms);
                swap(array, i, j);;
            }
        }
    }


}
