public class DynamicCirQueue extends CirQueue{
    public DynamicCirQueue(){
        super();

    }
    public DynamicCirQueue(int size){
        super(size);
    }

    @Override
    public boolean add(int val) {
        if(this.isFull()){
            int temp[] = new int[data.length * 2];
            for(int i=0 ; i<data.length ;i++){
                temp[i] = data[(front+i)%data.length];
            }
            front = 0;
            rear = data.length;
            data = temp;
        }

        return super.add(val);
    }
}
