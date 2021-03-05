import java.util.EmptyStackException;

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

    private int checkPrecedence(char symbol)
    {
        switch(symbol)
        {
            case '+': case '-':
                return 1;
            case '*': case '/':
                return 2;
            default: break;
        }
        return 0;
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

        while(index < infix.length())
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
                    while(!operatorStack.isEmpty() && checkPrecedence(currentChar) <= checkPrecedence(operatorStack.peek()))
                    {
                        postfix.append(operatorStack.pop());
                    }
                    operatorStack.push(currentChar);
                    break;
                case '(':
                    operatorStack.push(currentChar);
                    break;
                case ')':
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
        
        private Node getNextNode()
        {
            return next;
        } // end getNextNode
        
        /*
        private void setData(T newData)
        {
            data = newData;
        } // end setData
        
        
        private void setNextNode(Node nextNode)
        {
            next = nextNode;
        } // end setNextNode */

    } // end Node
} // end LinkedStack
