package training.algs.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.dto.BST;
import training.util.BSTUtils;

import java.util.List;

class BranchSumTest {

    @Test
    void branchSums() {
        BST tree = BSTUtils.createTreeFromFile("src/main/resources/branch_sum_tree.json");
        List<Integer> branchSums = BranchSum.branchSums(tree);
        Assertions.assertEquals(5, branchSums.size());
        Assertions.assertEquals(55, branchSums.get(0));
        Assertions.assertEquals(61, branchSums.get(1));
        Assertions.assertEquals(70, branchSums.get(2));
        Assertions.assertEquals(79, branchSums.get(3));
        Assertions.assertEquals(131, branchSums.get(4));
    }

}