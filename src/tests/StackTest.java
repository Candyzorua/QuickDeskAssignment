package tests;

import model.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    Stack s1;

    @BeforeEach
    public void setUp() {
        s1 = new Stack();
    }

    @Test
    public void testConstructor() {
        assertEquals(0, s1.size());
    }

    @Test
    public void addVal() {
        String[] r1 = s1.enqueue("firstVal");
        String[] r2 = s1.enqueue("secondVal");
        assertEquals(2, s1.size());
        assertArrayEquals(new String[]{"firstVal"}, r1);
        assertArrayEquals(new String[]{"firstVal", "secondVal"}, r2);
    }

    @Test
    public void removeVal() {
        s1.enqueue("firstVal");
        s1.enqueue("secondVal");
        String r1 = s1.dequeue();
        assertEquals("secondVal", r1);
        assertArrayEquals(new String[]{"firstVal"}, s1.getQueue());
    }
}
