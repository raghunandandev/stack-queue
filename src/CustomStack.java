public class CustomStack {
    protected int data[];
    private static final int DEFAULT_SIZE = 5;

    int ptr = -1;
    public CustomStack(int n){
        this.data = new int[n];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int val) throws StackException{
        if(isFull()){
            throw new StackException("Cannot push in a full stack ");
            //System.out.println("Stack is full");
            //return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek in empty stack");
        }
        return data[ptr];
    }
}
