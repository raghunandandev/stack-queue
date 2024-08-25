public class QueueLL {
    static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }


    }
    static class Queue{
        public static Node head = null;
        public static Node tail = null;
        public static boolean isEmpty(){
            return (head == null || tail == null);
        }
        public static void add(int val){
            Node newNode = new Node(val);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int front(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.val;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int removed = head.val;
            if(head.next == null){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return removed;
        }


    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(23);
        q.add(43);
        System.out.println(q.remove());
        System.out.println(q.remove());
    }

}
