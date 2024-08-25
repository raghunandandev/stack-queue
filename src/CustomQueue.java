public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean add(int val){
        if(isFull()){
            return false;
        }
        data[end++] = val;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue!!!!!!!");
        }

        int removed = data[0];

        for(int i=1; i<end ;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue!!!!!!!");
        }
        return data[0];
    }

    public void display(){
        for(int i=0 ; i<end ;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("End");
    }
}
