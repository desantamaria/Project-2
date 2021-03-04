import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LinkedStackTest {
    public static void main(String[] args) {
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
    }
}
