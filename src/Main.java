import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        //CustomStack stack = new CustomStack();

        DynamicStack stack = new DynamicStack();

        stack.push(12);
        stack.push(6);
        stack.push(87);
        stack.push(62);
        stack.push(14);
        stack.push(232);
        stack.push(12);
        stack.push(6);
        stack.push(87);
        stack.push(62);
        stack.push(14);
        stack.push(232);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());




    }
}