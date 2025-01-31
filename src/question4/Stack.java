package question4;

interface StackADT {
    void push(int element) throws StackOverflowException;

    int pop() throws StackUnderflowException;

    int peek() throws StackUnderflowException;

    boolean isEmpty();

    boolean isFull();
}
