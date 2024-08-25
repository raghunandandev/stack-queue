public class CirQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 5;
    protected int front = 0;
    protected int rear = 0;
    protected int size = 0;

    public CirQueue(){
        this(DEFAULT_SIZE);
    }
    public CirQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return (size == data.length);
    }
    public boolean isEmpty(){
        return size == 0 ;
    }

    public boolean add(int val){
        if(isFull()) return false;

        data[rear++] = val;
        rear %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()) throw new Exception("Empty Queue");

        int removed = data[front++];
        front %= data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()) throw new Exception("Empty Queue");
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue");
        }
        int i= front;
        do {

            System.out.print(data[i] + "->");
            i = (i + 1) % data.length;
        } while (i != rear);

        System.out.println("End");
    }
}
