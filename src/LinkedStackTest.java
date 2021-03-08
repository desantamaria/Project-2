package src;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class LinkedStackTest {
    public static void main(String[] args) {
        System.out.println("Hello");

    }
    
    @Test
    public void infixToPostfix() {
        LinkedStack<Character> expression = new LinkedStack<>();

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a*b/(c-a)+d*e"));
        System.out.println("Function converts equation to postfix");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(expression.convertToPostfix("a*b/(c-a)+d*e"));
    }
    
    @Test
    public void checkIfAlpha() {
        LinkedStack<Character> expression = new LinkedStack<>();
        System.out.println("Function converts equation to postfix");

        assertEquals('~', expression.checkIfAlpha('b'));
        System.out.println("Test 1:");
        System.out.println("Expected Result: ~");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkIfAlpha('b'));
        System.out.println();

        assertEquals('~', expression.checkIfAlpha('z'));
        System.out.println("Test 2:");
        System.out.println("Expected Result: ~");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkIfAlpha('z'));
        System.out.println();

        assertEquals('/', expression.checkIfAlpha('/'));
        System.out.println("Test 3:");
        System.out.println("Expected Result: /");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkIfAlpha('/'));
        System.out.println();

        assertEquals('*', expression.checkIfAlpha('*'));
        System.out.println("Test 4:");
        System.out.println("Expected Result: *");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkIfAlpha('*'));
        System.out.println();
    }

    @Test
    public void testCheckPrecedence()
    {
        LinkedStack<Character> expression = new LinkedStack<>();
        System.out.println("Function assigns an integer value to an operator");

        assertEquals(1, expression.checkPrecedence('-'));
        System.out.println("Test 1:");
        System.out.println("Expected Result: 1");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkPrecedence('-'));
        System.out.println();

        assertEquals(1, expression.checkPrecedence('+'));
        System.out.println("Test 2:");
        System.out.println("Expected Result: 1");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkPrecedence('+'));
        System.out.println();

        assertEquals(2, expression.checkPrecedence('/'));
        System.out.println("Test 3:");
        System.out.println("Expected Result: 2");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkPrecedence('/'));
        System.out.println();

        assertEquals(2, expression.checkPrecedence('*'));
        System.out.println("Test 4:");
        System.out.println("Expected Result: 2");
        System.out.print("Actual Result: ");
        System.out.println(expression.checkPrecedence('*'));
        System.out.println();

    }
}
