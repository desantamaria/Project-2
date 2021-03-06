import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayStackTest {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public static int postfixEval(String postfixInput) {
        ResizeableArrayStack<Character> valueStack = new ResizeableArrayStack<>();
        int Result = valueStack.evaluatePostfix(postfixInput);
        
        return Result;
    }
    
    @Test
    public void TestpostfixEval() {
        assertEquals(33, postfixEval("23*42-/56*+"));
        
        System.out.println("Algorithm evaluates postfix equation");
        System.out.println("Expected Result: 33");
        System.out.print("Actual Result: ");
        System.out.println(postfixEval("23*42-/56*+"));            
    }

}
