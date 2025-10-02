public class StackArray {
    private int maxSize;    // Maximum size of stack
    private int top;        // Index of top element
    private int stack[];    // Array to store elements

    // stack size is declare using constructor
    public StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int value = stack[top--];
            System.out.println(value + " popped from stack.");
            return value;
        }
    }

    // peek operation 
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // check if the stack is empty or not 
    public boolean isEmpty() {
        return (top == -1);
    }

    // display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);  //oveflow case
        stack.display();

        while (!stack.isEmpty()) {
            stack.pop();
        }
        //underflow case
        stack.pop(); 
    }
}
