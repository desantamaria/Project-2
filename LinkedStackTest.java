import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LinkedStackTest {
    public static void main(String[] args) {
        System.out.println("Function converts equation to postfix");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(infixToPostfix("a*b/(c-a)+d*e"));
    }
    
    public static String infixToPostfix(String Infix) {
        LinkedStack<Character> expression = new LinkedStack<>();
        String Postfix = expression.convertToPostfix(Infix);
        
        return Postfix;
    }

    @Test
    public void TestinfixToPostfix() {
        assertEquals("ab*ca-/de*+", infixToPostfix("a*b/(c-a)+d*e"));
        
        System.out.println("Function converts equation to postfix");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(infixToPostfix("a*b/(c-a)+d*e"));            
    }
}
