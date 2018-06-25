package java.com.codecool.stack;

import com.codecool.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pop() {
        Stack arr = new Stack(10);
        arr.push("Egy");
        arr.push("Kettő");
        assertEquals("Kettő", arr.pop());
        assertEquals("Egy", arr.pop());
    }

    @Test
    void peek() {
        Stack arr = new Stack(10);
        arr.push("Egy");
        arr.push("Kettő");
        assertEquals("Kettő", arr.peek());
        assertEquals("Kettő", arr.peek());
    }
}