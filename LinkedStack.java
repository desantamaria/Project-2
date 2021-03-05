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

    /**
     * Checks if the char input into the function is part of the alphabet, if it is then the function will output ~ to represent a member of the alphabet, if not then it returns the char.
     * @param input represents an individual character in a string of equations
     * @return a char that represents if it is alphabetical which is represented by the ~ sign, or returns the char if the input is not part of the alphabet.
     */
    public char checkIfAlpha(char input) //checks if character is a member of the alphabet
    {
        if(Character.isLetter(input)) {
            return '~'; //signifier for a letter of the alphabet
        } else {
            return input;
        }
    }

    /**
     * Checks the precedence of an operator and assigns it an int value
     * @param symbol operator from which the precedence will be obtained
     * @return int that represents the precedence of the symbol
     */
    public int checkPrecedence(char symbol)
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
     * Function that converts infix equation in the form of the string to a postfix equation.
     * @param infix equation you input, in infix form
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
