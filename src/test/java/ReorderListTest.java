import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static common.ListNodeBuilder.buildList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReorderListTest {

    ReorderList reorderList;

    @BeforeEach
    void setUp() {
        reorderList = new ReorderList();
    }

    @Test
    void reorderList() {
        ListNode listNode = buildList(new int[]{1, 2, 3, 4});
        reorderList.reorderList(listNode);
        assertEquals(new int[]{1, 4, 2, 3}, listNode);
    }
}