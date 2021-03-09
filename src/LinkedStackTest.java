package src;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/**
@author Daniel Santamaria
@author Renwell Queyquep
CS2400
3/7/21 
*/

public class LinkedStackTest {

    private static final String EXPECTED_RESULT_AB_CA_DE = "Expected Result: ab*ca-/de*+";
    private static final String ACTUAL_RESULT = "Actual Result: ";

    public static void main(String[] args) {
        LinkedStack<Character> expression = new LinkedStack<>();
        System.out.println("Function converts equation to postfix");
        System.out.println("Input: a*b/(c-a)+d*e");
        System.out.println(EXPECTED_RESULT_AB_CA_DE);
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.convertToPostfix("a*b/(c-a)+d*e"));
    } // end main
    


    @Test
    public void testConvertToPostfix()
    {
        LinkedStack<Character> expression = new LinkedStack<>();
        System.out.println("Function converts equation to postfix");
        System.out.println();

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a * b / (c - a) + d * e"));
        System.out.println("Input: a * b / (c - a) + d * e");
        System.out.println(EXPECTED_RESULT_AB_CA_DE);
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.convertToPostfix("a * b / (c - a) + d * e")); 
        System.out.println();

        assertEquals("ab*ca-/de*+", expression.convertToPostfix("a*b / (c - a)                     + d*e"));
        System.out.println("Input: a*b / (c - a)                     + d*e");
        System.out.println(EXPECTED_RESULT_AB_CA_DE);
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.convertToPostfix("a*b / (c - a)                     + d*e")); 
        System.out.println();

        assertEquals("ab*c*ad/-", expression.convertToPostfix("a*b*c - (a / d)"));
        System.out.println("Input: a*b*c - (a / d)");
        System.out.println("Expected Result: ab*c*ad/-");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.convertToPostfix("a*b*c - (a / d)")); 
    }

    @Test
    public void testCheckIfAlpha()
    {
        LinkedStack<Character> expression = new LinkedStack<>();
        System.out.println("Function checks if a char is alphabetical, if it is it returns a ~ symbol");
        System.out.println();

        assertEquals('~', expression.checkIfAlpha('b'));
        System.out.println("Test 1:");
        System.out.println("Expected Result: ~");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkIfAlpha('b'));
        System.out.println();

        assertEquals('~', expression.checkIfAlpha('z'));
        System.out.println("Test 2:");
        System.out.println("Expected Result: ~");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkIfAlpha('z'));
        System.out.println();

        assertEquals('/', expression.checkIfAlpha('/'));
        System.out.println("Test 3:");
        System.out.println("Expected Result: /");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkIfAlpha('/'));
        System.out.println();

        assertEquals('*', expression.checkIfAlpha('*'));
        System.out.println("Test 4:");
        System.out.println("Expected Result: *");
        System.out.print(ACTUAL_RESULT);
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
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkPrecedence('-'));
        System.out.println();

        assertEquals(1, expression.checkPrecedence('+'));
        System.out.println("Test 2:");
        System.out.println("Expected Result: 1");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkPrecedence('+'));
        System.out.println();

        assertEquals(2, expression.checkPrecedence('/'));
        System.out.println("Test 3:");
        System.out.println("Expected Result: 2");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkPrecedence('/'));
        System.out.println();

        assertEquals(2, expression.checkPrecedence('*'));
        System.out.println("Test 4:");
        System.out.println("Expected Result: 2");
        System.out.print(ACTUAL_RESULT);
        System.out.println(expression.checkPrecedence('*'));
        System.out.println();

    }
} // end LinkStackTest
