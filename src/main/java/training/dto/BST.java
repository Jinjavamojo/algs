package training.dto;

import lombok.Data;

@Data
public class BST {

    private int value;
    private BST left;
    private BST right;

    public BST(int value) {
        this.value = value;
    }
}
