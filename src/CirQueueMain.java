public class CirQueueMain {
    public static void main(String[] args) throws Exception{
        CirQueue queue = new CirQueue();


        queue.add(21);
        queue.add(54);
        queue.add(9);
        queue.add(51);
        queue.add(67);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.add(646);
        queue.display();


        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();
    }
}
