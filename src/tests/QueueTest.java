package tests;

import model.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    Queue q1;

    @BeforeEach
    public void setUp() {
        q1 = new Queue();
    }

    @Test
    public void testConstructor() {
        assertEquals(0, q1.size());
    }

    @Test
    public void addVal() {
        String[] r1 = q1.enqueue("firstVal");
        String[] r2 = q1.enqueue("secondVal");
        assertEquals(2, q1.size());
        assertArrayEquals(new String[]{"firstVal"}, r1);
        assertArrayEquals(new String[]{"firstVal", "secondVal"}, r2);
    }

    @Test
    public void removeVal() {
        q1.enqueue("firstVal");
        q1.enqueue("secondVal");
        String r1 = q1.dequeue();
        assertEquals("firstVal", r1);
        assertArrayEquals(new String[]{"secondVal"}, q1.getQueue());
    }
}
