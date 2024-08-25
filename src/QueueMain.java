public class QueueMain {
    public static void main(String[] args) throws Exception{

        DynamicCirQueue queue = new DynamicCirQueue();

        queue.add(21);
        queue.add(54);
        queue.add(9);
        queue.add(51);
        queue.add(67);
        queue.add(21);
        queue.add(54);
        queue.add(9);
        queue.add(51);
        queue.add(67);
        queue.add(21);
        queue.add(54);
        queue.add(9);
        queue.add(51);
        queue.add(67);
        queue.add(21);
        queue.add(54);
        queue.add(9);
        queue.add(51);
        queue.add(67);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();
    }
}
