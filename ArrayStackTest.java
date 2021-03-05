import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayStackTest {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

<<<<<<< HEAD
    public static int higher(int x, int y){
        if (x > y)   
            return x;
        else 
            return y;
=======
    public static char postfixEval(String postfixInput) {
        ResizeableArrayStack<Character> valueStack = new ResizeableArrayStack<>();
        char Result = valueStack.evaluatePostfix(postfixInput);
        
        return Result;
>>>>>>> 08d44223fd6cb77a5379b8729e9285ece6b5bac9
    }
    
    @Test
    public void TestpostfixEval() {
        assertEquals("33", postfixEval("23*42-/56*+"));
        
        System.out.println("Algorithm evaluates postfix equation");
        System.out.println("Expected Result: 33");
        System.out.print("Actual Result: ");
        System.out.println(postfixEval("23*42-/56*+"));            
    }

}
