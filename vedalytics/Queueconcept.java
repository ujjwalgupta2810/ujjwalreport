package vedalytics;

public class Queueconcept {
    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;
        
        void insert(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void display() {
            if (head == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node ref = head;
            while (ref != null) {
                System.out.print(ref.data + " ");
                ref = ref.next;
            }
            System.out.println();
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty. Cannot remove.");
                return -1;
            }
            int removedData = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return removedData;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.display();
}
}