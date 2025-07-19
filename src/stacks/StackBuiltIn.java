package stacks;

import java.util.Stack;

public class StackBuiltIn {

    public static void main(String[] args){
        System.out.println("\nBuilt in Java stack");
        Stack<Integer> stack = new Stack<>();
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // Peek top
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop elements
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20

        System.out.println(stack);

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // Final stack state
        System.out.println("Current stack: " + stack); // [10]
    }
}
