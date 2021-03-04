import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LinkedStackTest {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Hello");

    }
    
    @Test
    public void testConvertToPostfix()
    {
        LinkedStack<Character> expression = new LinkedStack<>();

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a*b/(c-a)+d*e"));
        System.out.println("Function converts equation to postfix");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(expression.convertToPostfix("a*b/(c-a)+d*e")); 
=======
        //LinkedStack<Character> expression = new LinkedStack<>();
        //System.out.println(expression.convertToPostfix("a*b/(c-a)+d*e")); 
    }
    
    public static String infixToPostfix() {
        LinkedStack<Character> expression = new LinkedStack<>();
        String Postfix = expression.convertToPostfix("a*b/(c-a)+d*e");
        return Postfix;
    }
    
    @Test
    public void TestinfixToPostfix() {
        assertEquals("ab*ca-/de*+", infixToPostfix());        
>>>>>>> 91f526175322dab962259a3fb4c46144472fbae9
    }
}
