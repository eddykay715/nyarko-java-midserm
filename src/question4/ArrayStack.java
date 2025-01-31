package question4;

class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        this.capacity = size;
        this.stack = new int[size];
        this.top = -1; // Stack is empty initially
    }

    @Override
    public void push(int element) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack Overflow: Cannot push " + element);
        }
        stack[++top] = element;
    }

    @Override
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack Underflow: Cannot pop from an empty stack");
        }
        return stack[top--];
    }

    @Override
    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack Underflow: Cannot peek from an empty stack");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }
}



