import java.util.*;

public class MainQueue<E> {
    private Queue<E> queue;

    public MainQueue() {
        queue = new LinkedList<E>();
    }   

    public void enqueue(E object) {
        queue.add(object);
        System.out.println();
        System.out.println("Tugas " + object + " telah ditambahkan");
        System.out.println();
    }
        // remove object from queue
    public E dequeue() throws NoSuchElementException {
        System.out.println();
        System.out.println("Data " + queue.element() + " telah selesai dikerjakan");
        System.out.println();
        return queue.remove();
    }
        // determine if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
        // output queue contents
    public void printQueue() {
       if (queue.isEmpty()) {
            System.out.println();
            System.out.println("Tugas tidak tersedia");
            System.out.println();
       } else {
        Iterator<E> iterator = queue.iterator();
        System.out.println("Daftar Tugas: ");
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println("    Tugas " + " " +value + " ");
        }
       }
    }
}