package question4;

public class StackApp {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        try {
            // Push elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println("Top element (peek): " + stack.peek());

            // Pop elements from the stack
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());

            System.out.println("Top element after popping: " + stack.peek());

            // Push another element
            stack.push(60);
            System.out.println("Top element after pushing 60: " + stack.peek());

        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
