package training.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import training.dto.BST;
import training.dto.BSTFileDto;
import training.dto.BSTFileRowDto;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BSTUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     *  Create tree from file input
     * @param filePath with tree data
     * @return BST root
     */
    public static BST createTreeFromFile(String filePath) {
        try {
            return createTree(mapper.readValue(new File(filePath), BSTFileDto.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static BST createTree(BSTFileDto bstFileDto) {
        Map<String, BSTFileRowDto> nodeMap = new HashMap<>();
        bstFileDto.getNodes().forEach(node -> nodeMap.put(node.getId(), node));
        BSTFileRowDto BSTFileRowDto = nodeMap.get(bstFileDto.getRootNodeValue());
        return createNode(BSTFileRowDto, nodeMap);
    }

    private static BST createNode(BSTFileRowDto node, Map<String, BSTFileRowDto> nodeMap) {
        BST bst = new BST(node.getValue());
        if (node.getLeft() != null) {
            bst.setLeft(createNode(nodeMap.get(node.getLeft()), nodeMap));
        }
        if (node.getRight() != null) {
            bst.setRight(createNode(nodeMap.get(node.getRight()), nodeMap));
        }
        return bst;
    }
}
