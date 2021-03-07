import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayStackTest {
    public static void main(String[] args) {
        System.out.println("Algorithm evaluates postfix equation");
        System.out.println("Expected Result: 33");
        System.out.print("Actual Result: ");
        System.out.println(postfixEval("2 3* 4 2-/ 5 6*+"));
    }

    public static int postfixEval(String postfixInput) {
        ResizeableArrayStack<Character> valueStack = new ResizeableArrayStack<>();
        int Result = valueStack.evaluatePostfix(postfixInput);
        
        return Result;
    }
    
    @Test
    public void TestpostfixEval() {
        assertEquals(33, postfixEval("2 3* 4 2-/ 5 6*+"));
        
        System.out.println("Algorithm evaluates postfix equation");
        System.out.println("Expected Result: 33");
        System.out.print("Actual Result: ");
        System.out.println(postfixEval("2 3* 4 2-/ 5 6*+"));
        
        assertEquals(10, postfixEval("5 5+"));
        assertEquals(2, postfixEval("4 2-"));
        assertEquals(30, postfixEval("6 5*"));
        assertEquals(3, postfixEval("6 2/"));
        assertEquals(4, postfixEval("2 2^"));

        assertEquals("", "");

        assertEquals(35, postfixEval("30 5+"));
        assertEquals(3030, postfixEval("20 30* 40 20-/ 50 60*+"));

        assertEquals(53, postfixEval("78 30 5 28 8 + * - 6 / +"));
    }

}
