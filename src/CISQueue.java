import java.util.LinkedList;

public class CISQueue<T> {

    // Linked list property.
    private LinkedList<T> queue;

    // Size property.
    private int size;

    // Constructor.
    public CISQueue(){
        this.size = 0;
        queue = new LinkedList<>();
    }
    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(T data){
        queue.addLast(data);
        size++;
    }

    // Dequeue. This method removes a node from the beginning of the linked list.
    public T dequeue(){
        //if LinkedList is empty, return null
        if (this.size ==0){
            return null;
        }
        T data = this.queue.peekFirst();
        this.queue.removeFirst();
        size--;
        return data;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        return (this.size == 0);
    }

    // size. Returns the size of the queue.
    public int size(){
        return this.size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}
    public String toString(){
        if (isEmpty()){
            return "CISQueue{queue=[], size=0}";
        }
        String stringQueue = "";
        for (int i = 0; i < this.size - 1; i++){
            stringQueue  += this.queue.get(i).toString() + ", ";
        }
        stringQueue  += this.queue.getLast().toString();
        return "CISQueue{queue=[" + stringQueue  + "], size=" + this.size + "}";
    }
}
