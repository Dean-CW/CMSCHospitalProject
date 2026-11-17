//
// This is a generic Queue class. 
// The class parameter is the type of data being stored.
// Usage:
// To make a queue of Alerts
//   Queue<A;ert> queue = new Queue<Alert>
// See the accompanying QueueTest class for complete examples.

public class Queue<T> {
    private QueueRecord head;
    private QueueRecord tail;

    public Queue() {
        head = null; tail = null;
    }

    public void enqueue( T obj ) {
        QueueRecord newRec = new QueueRecord( obj );
        if (head == null) {
            head = newRec; 
            tail = newRec;
        } else {
            tail.next = newRec;
            tail = newRec;
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        } else if (head == tail){
            T obj = head.data;
            head = null; tail = null;
            return obj;
        } else {
            T obj = head.data;
            head = head.next;
            return obj;
        }

    }

    public int count() {
        int ct = 0;
        QueueRecord curr = head;
        while (curr != null) { 
            ct++; curr = curr.next;
        }
        return ct;
    }

    public T peek() {
        if (head == null) {
            return null;
        } else {
            return head.data;
        }
    }

    private class QueueRecord {
        public QueueRecord( T obj ) {
            data = obj; next = null;
        }
        public T data;
        public QueueRecord next;
    }
}

