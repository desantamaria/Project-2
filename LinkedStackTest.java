import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LinkedStackTest {
    public static void main(String[] args) {
        System.out.println("Hello");

    }
    
    public static String infixToPostfix(String Infix) {
        LinkedStack<Character> expression = new LinkedStack<>();
<<<<<<< HEAD

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a*b/(c-a)+d*e"));
        System.out.println("Function converts equation to postfix");
        System.out.println();

        System.out.println("Input: a*b/(c-a)+d*e");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(expression.convertToPostfix("a*b/(c-a)+d*e")); 
        System.out.println();

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a * b / (c - a) + d * e"));
        System.out.println("Input: a * b / (c - a) + d * e");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(expression.convertToPostfix("a * b / (c - a) + d * e")); 
        System.out.println();

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a*b / (c - a)                     + d*e"));
        System.out.println("Input: a*b / (c - a)                     + d*e");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(expression.convertToPostfix("a*b / (c - a)                     + d*e")); 
        System.out.println();

        assertEquals("ab*c*ad/-", expression.convertToPostfix("a*b*c - (a / d)"));
        System.out.println("Input: a*b*c - (a / d)");
        System.out.println("Expected Result: ab*c*ad/-");
        System.out.print("Actual Result: ");
        System.out.println(expression.convertToPostfix("a*b*c - (a / d)")); 
    }

    @Test
    public void testCheckIfAlpha()
    {
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
=======
        String Postfix = expression.convertToPostfix(Infix);
        
        return Postfix;
>>>>>>> 08d44223fd6cb77a5379b8729e9285ece6b5bac9
    }

    @Test
<<<<<<< HEAD
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

=======
    public void TestinfixToPostfix() {
        assertEquals("ab*ca-/de*+", infixToPostfix("a*b/(c-a)+d*e"));
        
        System.out.println("Function converts equation to postfix");
        System.out.println("Expected Result: ab*ca-/de*+");
        System.out.print("Actual Result: ");
        System.out.println(infixToPostfix("a*b/(c-a)+d*e"));            
>>>>>>> 08d44223fd6cb77a5379b8729e9285ece6b5bac9
    }
}
