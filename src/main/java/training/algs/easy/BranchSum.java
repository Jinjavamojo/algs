package training.algs.easy;

import training.dto.BST;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    /**
     * Write a function that takes in a binary tree and return a list of its branch sums ordered
     * from leftmost branch sum to rightmost branch sum
     * @param root tree
     * @return list of sums
     */
    public static List<Integer> branchSums(BST root) {
        List<Integer> sums = new ArrayList<>();
        calculateBranch(root, 0, sums);
        return sums;
    }

    public static void calculateBranch(BST root, int sum, List<Integer> sums) {
        sum += root.getValue();
        if (root.getLeft() == null && root.getRight() == null) {
            sums.add(sum);
            return;
        }
        if (root.getLeft() != null) {
            calculateBranch(root.getLeft(), sum, sums);
        }
        if (root.getRight() != null) {
            calculateBranch(root.getRight(), sum, sums);
        }
    }
}
