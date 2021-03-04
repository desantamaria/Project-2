public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<Character> expression = new LinkedStack<>();
        System.out.println(expression.convertToPostfix("a*b/(c-a)+d*e")); 
    }
    
/*     public static void testConvertToPostfix()
    {

    } */
}
