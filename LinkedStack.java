import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.EmptyStackException;
import org.junit.Test;

/**
    A class of stacks whose entries are stored in a chain of nodes. */
public final class LinkedStack<T> implements StackInterface<T>
{
	private Node topNode; // References the first node in the chain
  
    public LinkedStack()
    {
        topNode = null;
    } // end default constructor
  
    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
    } // end push

    public T peek()
    {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return topNode.getData();
    } // end peek

    public T pop()
    {
        T top = peek();  // Might throw EmptyStackException

        // Assertion: topNode != null
        topNode = topNode.getNextNode();

        return top;
    } // end pop

    public boolean isEmpty()
    {
        return topNode == null;
    } // end isEmpty

    public void clear()
    {
        topNode = null;
    } // end clear

    private char checkIfAlpha(char input) //checks if character is a member of the alphabet
    {
        if(Character.isLetter(input)) {
            return '~'; //signifier for a letter of the alphabet
        } else {
            return input;
        }
    }

    private int checkPrecedence(int number)
    {
        switch(number)
        {
            case '+': case '-':
                return 0;
            case '*': case '/':
                return 1;
            default: break;
        }
        return 3;
    }

    /**
     * 
     * @param infix
     * @return string that shows the postfix form of infix equation inputted.
     */
    public String convertToPostfix(String infix)
    {
        StackInterface<Character> operatorStack = new LinkedStack<>();
        StringBuilder postfix = new StringBuilder();
        int index = 0;

        while(infix.length() > 0)
        {
            char currentChar = checkIfAlpha(infix.charAt(index));
            switch(currentChar)
            {
                case '~':
                    postfix.append(infix.charAt(index));
                    break;
                case '^':
                    operatorStack.push(currentChar);
                    break;
                case '+': case '-': case '*': case '/':
                    while(!operatorStack.isEmpty() && checkPrecedence(infix.charAt(index)) <= checkPrecedence(operatorStack.peek()))
                    {
                        postfix.append(operatorStack.pop());
                    }
                    operatorStack.push(currentChar);
                    System.out.println(operatorStack.peek());
                    break;
                case '(':
                    operatorStack.push(currentChar);
                    break;
                case ')':
                    System.out.println(operatorStack.peek());
                    char topOperator = operatorStack.pop();
                    while(topOperator != '(')
                    {
                        postfix.append(topOperator);
                        topOperator = operatorStack.pop();
                    }
                    break;
                default: break;
            }
            index++;
        }
        while(!operatorStack.isEmpty())
        {
            postfix.append(operatorStack.pop());
        }
        return postfix.toString();
    }

    @Test
    public void testConvertToPostfix()
    {
        LinkedStack<Character> newString = new LinkedStack<>();
        assertEquals("ab*ca-/de*+", newString.convertToPostfix("a*b/(c-a)+d*e"));
    }

	private class Node
	{
        private T    data; // Entry in stack
        private Node next; // Link to next node
      
        private Node(T dataPortion)
        {
            this(dataPortion, null);
        } // end constructor
      
        private Node(T dataPortion, Node linkPortion)
        {
            data = dataPortion;
            next = linkPortion;
        } // end constructor
      
        private T getData()
        {
            return data;
        } // end getData
        
        private void setData(T newData)
        {
            data = newData;
        } // end setData
        
        private Node getNextNode()
        {
            return next;
        } // end getNextNode
        
        private void setNextNode(Node nextNode)
        {
            next = nextNode;
        } // end setNextNode
	} // end Node
} // end LinkedStack
