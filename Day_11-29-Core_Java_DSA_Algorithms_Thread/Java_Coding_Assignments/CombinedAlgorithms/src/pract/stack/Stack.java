package pract.stack;

// Define the Stack class
public class Stack {
    private int[] stack; // Array to hold stack elements
    private int top; // Index of the top element
    private int capacity; // Maximum size of the stack

    // Constructor to initialize stack
    public Stack(int size) {
        capacity = size; // Set the stack's capacity
        stack = new int[capacity]; // Create the stack array
        top = -1; // Stack is empty initially
    }
    
    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        if (top == capacity - 1) { // Check if stack is full
            System.out.println("Stack Overflow"); // Print error message
            return;
        }
        stack[++top] = value; // Increment top and add the new value
        System.out.println("\n"+ value + " pushed to stack"); // Print confirmation
    }
    
    // Pop operation: Removes and returns the top element from the stack
    public int pop() {
        if (isEmpty()) { // Check if stack is empty
            System.out.println("Stack Underflow"); // Print error message
            return -1; // Return -1 to indicate error
        }
        return stack[top--]; // Return top element and decrement top
    }
    
    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) { // Check if stack is empty
            System.out.println("Stack is empty"); // Print error message
            return -1; // Return -1 to indicate error
        }
        return stack[top]; // Return top element
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1; // Return true if top is -1 (stack is empty)
    }
    
    // Display the stack elements
    public void display() {
        if (isEmpty()) { // Check if stack is empty
            System.out.println("\nStack is empty"); // Print message if empty
            return;
        }
        System.out.print("\nStack elements: "); // Print header
        for (int i = 0; i <= top; i++) { // Loop through stack elements
            System.out.print(stack[i] + " "); // Print each element
        }
        System.out.println(); // Print newline at the end
    }
    
    public static void main(String[] args) {
        // Create a stack of size 5
        Stack stack = new Stack(5);
        
        // Perform stack operations
        stack.push(10); // Push 10 to stack
        stack.push(20); // Push 20 to stack
        stack.push(30); // Push 30 to stack
        stack.push(40); // Push 40 to stack
        stack.push(50); // Push 50 to stack
        
        // Display stack
        stack.display(); // Output: Stack elements: 10 20 30 40 50 
        
        // Peek top element
        System.out.println("\nTop element is " + stack.peek()); // Output: Top element is 50
        
        // Pop elements
        System.out.println("\n"+stack.pop() + " popped from stack"); // Output: 50 popped from stack
        System.out.println("\n"+stack.pop() + " popped from stack"); // Output: 40 popped from stack
        
        // Display stack
        stack.display(); // Output: Stack elements: 10 20 30
        
        // Check if stack is empty
        System.out.println("\nIs stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
    }
}


//		Here’s the flowchart for the `Stack` class, which demonstrates basic stack operations:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `Stack` Class)
//		   |
//		   V
//		(Define Instance Variables)
//		   - `private int[] stack` // Array to hold stack elements
//		   - `private int top` // Index of the top element
//		   - `private int capacity` // Maximum size of the stack
//		   |
//		   V
//		(Define `Stack(int size)` Constructor)
//		   |
//		   V
//		(Set `capacity = size`) // Initialize stack capacity
//		   |
//		   V
//		(Create `stack` Array) // Allocate memory for stack
//		   |
//		   V
//		(Set `top = -1`) // Initialize stack as empty
//		   |
//		   V
//		(Define `push(int value)` Method)
//		   |
//		   V
//		(If `top == capacity - 1`) // Check if stack is full
//		   |
//		   V
//		   (Print "Stack Overflow") // Print error message
//		   |
//		   V
//		   (Return) // Exit method
//		   |
//		   V
//		(Else)
//		   |
//		   V
//		(Increment `top` and Assign `stack[top] = value`) // Push value to stack
//		   |
//		   V
//		(Print confirmation "value pushed to stack")
//		   |
//		   V
//		(End `push` Method)
//		   |
//		   V
//		(Define `pop()` Method)
//		   |
//		   V
//		(If `isEmpty()`) // Check if stack is empty
//		   |
//		   V
//		   (Print "Stack Underflow") // Print error message
//		   |
//		   V
//		   (Return -1) // Indicate error
//		   |
//		   V
//		(Else)
//		   |
//		   V
//		(Return `stack[top--]`) // Return and remove top element
//		   |
//		   V
//		(End `pop` Method)
//		   |
//		   V
//		(Define `peek()` Method)
//		   |
//		   V
//		(If `isEmpty()`) // Check if stack is empty
//		   |
//		   V
//		   (Print "Stack is empty") // Print error message
//		   |
//		   V
//		   (Return -1) // Indicate error
//		   |
//		   V
//		(Else)
//		   |
//		   V
//		(Return `stack[top]`) // Return top element
//		   |
//		   V
//		(End `peek` Method)
//		   |
//		   V
//		(Define `isEmpty()` Method)
//		   |
//		   V
//		(Return `top == -1`) // Check if stack is empty
//		   |
//		   V
//		(End `isEmpty` Method)
//		   |
//		   V
//		(Define `display()` Method)
//		   |
//		   V
//		(If `isEmpty()`) // Check if stack is empty
//		   |
//		   V
//		   (Print "Stack is empty") // Print message if empty
//		   |
//		   V
//		   (Return) // Exit method
//		   |
//		   V
//		(Else)
//		   |
//		   V
//		(Print "Stack elements: ") // Print header
//		   |
//		   V
//		(For `int i = 0; i <= top; i++`) // Loop through stack elements
//		   |
//		   V
//		   (Print `stack[i]`) // Print each element
//		   |
//		   V
//		(Print newline) // End of display
//		   |
//		   V
//		(End `display` Method)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Create Stack Object `stack = new Stack(5)`) // Create a stack of size 5
//		   |
//		   V
//		(Call `push(10)`) // Push 10 to stack
//		   |
//		   V
//		(Call `push(20)`) // Push 20 to stack
//		   |
//		   V
//		(Call `push(30)`) // Push 30 to stack
//		   |
//		   V
//		(Call `push(40)`) // Push 40 to stack
//		   |
//		   V
//		(Call `push(50)`) // Push 50 to stack
//		   |
//		   V
//		(Call `display()`) // Display stack elements
//		   |
//		   V
//		(Call `peek()`) // Peek top element
//		   |
//		   V
//		(Call `pop()`) // Pop top element
//		   |
//		   V
//		(Call `pop()`) // Pop next top element
//		   |
//		   V
//		(Call `display()`) // Display stack elements again
//		   |
//		   V
//		(Call `isEmpty()`) // Check if stack is empty
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `Stack` Class**: This class contains methods for stack operations and data storage.
//		
//		3. **Define Instance Variables**: 
//		   - `stack`: An array to hold stack elements.
//		   - `top`: Index of the top element.
//		   - `capacity`: Maximum size of the stack.
//		
//		4. **Define `Stack(int size)` Constructor**:
//		   - **Set `capacity = size`**: Initialize the stack capacity.
//		   - **Create `stack` Array**: Allocate memory for the stack based on capacity.
//		   - **Set `top = -1`**: Initialize the stack as empty.
//		
//		5. **Define `push(int value)` Method**:
//		   - **If Stack Full**: Check if the stack is full.
//		     - **Print "Stack Overflow"**: Print an error message if full.
//		     - **Return**: Exit the method.
//		   - **Else**:
//		     - **Push Value**: Increment `top` and add the new value.
//		     - **Print Confirmation**: Output a message confirming the push.
//		
//		6. **Define `pop()` Method**:
//		   - **If Stack Empty**: Check if the stack is empty.
//		     - **Print "Stack Underflow"**: Print an error message if empty.
//		     - **Return -1**: Indicate error.
//		   - **Else**:
//		     - **Pop Value**: Return and remove the top element.
//		
//		7. **Define `peek()` Method**:
//		   - **If Stack Empty**: Check if the stack is empty.
//		     - **Print "Stack is empty"**: Print an error message if empty.
//		     - **Return -1**: Indicate error.
//		   - **Else**:
//		     - **Peek Value**: Return the top element without removing it.
//		
//		8. **Define `isEmpty()` Method**:
//		   - **Check if Stack is Empty**: Return true if `top` is -1.
//		
//		9. **Define `display()` Method**:
//		   - **If Stack Empty**: Check if the stack is empty.
//		     - **Print "Stack is empty"**: Print a message if empty.
//		     - **Return**: Exit the method.
//		   - **Else**:
//		     - **Print Stack Elements**: Loop through the stack and print each element.
//		
//		10. **Define `main(String[] args)` Method**:
//		    - **Create Stack Object**: Create a stack of size 5.
//		    - **Perform Stack Operations**: Push elements onto the stack, display the stack, peek and pop elements, and display the stack again.
//		    - **Check if Stack is Empty**: Verify if the stack is empty.
//		
//		11. **End**: Completion of the program execution and output.
//		
//		This flowchart illustrates the structure and flow of operations for the stack implementation, including how elements are managed and interacted with.