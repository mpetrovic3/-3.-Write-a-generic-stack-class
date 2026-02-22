public class StackTest {

    public static void main(String[] args) {
        // test 1 Integer Stack
        System.out.println("Testing Integer Stack");

        Stack<Integer> numberStack = new Stack<>(3);

        try {
            // Push elements
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            // Display stack contents
            System.out.println("Stack contents: " + numberStack.list());

            // Peek top element
            System.out.println("Peek: " + numberStack.peek());

            // Pop element
            System.out.println("Pop: " + numberStack.pop());
            System.out.println("Stack after pop: " + numberStack.list());

            // Try pushing beyond capacity
            numberStack.push(40);
            numberStack.push(50);  // Should trigger exception

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // TEST 2: String Stack
        System.out.println("\nTesting String Stack");

        Stack<String> textStack = new Stack<>(2);

        try {
            textStack.push("Hello");
            textStack.push("World");

            System.out.println("Stack contents: " + textStack.list());

            System.out.println("Peek: " + textStack.peek());

            System.out.println("Pop: " + textStack.pop());
            System.out.println("Pop: " + textStack.pop());

            // Try popping from empty stack
            textStack.pop();  // Should trigger exception

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}