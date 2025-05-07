import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static common.TreeBuilder.buildTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeRightSideViewTest {

    private BinaryTreeRightSideView binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTreeRightSideView();
    }

    @Test
    void rightSideView() {
        assertEquals(Arrays.asList(1, 3, 4), binaryTree.rightSideView(buildTree(new Integer[]{1, 2, 3, null, 5, null, 4})));
        assertEquals(Arrays.asList(1, 3, 4, 5), binaryTree.rightSideView(buildTree(new Integer[]{1, 2, 3, 4, null, null, null, 5})));
        assertEquals(Arrays.asList(1, 3, 4), binaryTree.rightSideViewRec(buildTree(new Integer[]{1, 2, 3, null, 5, null, 4})));
        assertEquals(Arrays.asList(1, 3, 4, 5), binaryTree.rightSideViewRec(buildTree(new Integer[]{1, 2, 3, 4, null, null, null, 5})));
    }
}