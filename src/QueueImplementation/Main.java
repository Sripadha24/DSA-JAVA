package QueueImplementation;

public class Main {
    public static void main(String[] args) {
        QueueLinkeList list = new QueueLinkeList(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(50);
        list.printlist();
        list.dequeue();
        list.printlist();
    }
}
