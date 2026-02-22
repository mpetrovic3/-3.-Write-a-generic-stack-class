public class Stack <T> {
    private int capacity;
    private Object[] elements;
    private int top;

    /**
     * Default constructor
     * Stack with default capacity of 10
     */
    public Stack(){
        this.capacity = 10;
        this.elements = new Object[capacity];
        this.top = 0;
    }

    /**
     * Constructor with custom capacity.
     * @param capacity Maximum number of elements
     */
    public Stack(int capacity){
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = 0;
    }

    /**
     * Pushes an element onto the stack.
     * @param element Element to be pushed
     * @throws StackFullException if the stack is full
     */

    public void push(T element) throws StackFullException {
        if (top == capacity) {
            throw new StackFullException("Stack is full.");
        }
        elements[top] = element;
        top++;
    }


    /**
     * Removes and returns the top element of the stack.
     * @return The removed element
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty.");
        }
        top--;
        return (T) elements[top];  // Cast required
    }
    /**
     * Returns the top element without removing it.
     * @return The top element
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty.");
        }
        return (T) elements[top - 1];  // Cast required
    }

    /**
     * Returns all elements in the stack separated by semicolons.
     * Elements are listed from bottom to top.
     * @return String containing all elements separated by ";"
     */
    public String list() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < top; i++) {
            builder.append(elements[i]);
            if (i < top - 1) {
                builder.append(";");
            }
        }
        return builder.toString();
    }

    /**
     * Returns the current number of elements.
     * @return size of the stack
     */
    public int size() {
        return top;
    }
}
