import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LinkedStackTest {
    public static void main(String[] args) {
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
    }
}
