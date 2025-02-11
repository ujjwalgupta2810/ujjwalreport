package vedalytics;

public class DoublyLinkedListExample {

    // Node class 
    static class Node {
        int data;
        Node next;
        Node prev;

        // Constructor node ke liye
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // DoublyLinkedList class that contains methods for list operations
    static class DoublyLinkedList {
        Node head;
        Node tail;

        // Constructor to initialize the list
        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        // Method to add a node at the end of the list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Method to print the list from head to tail
        public void printForward() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to print the list from tail to head
        public void printBackward() {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }

        // Method to delete a node with a specific value
        public void delete(int value) {
            Node current = head;
            
            while (current != null) {
                if (current.data == value) {
                    // If the node is the head
                    if (current == head) {
                        head = current.next;
                        if (head != null) {
                            head.prev = null;
                        }
                    }
                    // If the node is the tail
                    if (current == tail) {
                        tail = current.prev;
                        if (tail != null) {
                            tail.next = null;
                        }
                    }
                    // If the node is in the middle
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
        }
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
        // Create a new doubly linked list
        DoublyLinkedList list = new DoublyLinkedList();

        // Append elements to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        // Print the list from head to tail
        System.out.println("Forward Print:");
        list.printForward(); // Output: 10 20 30 40

        // Print the list from tail to head
        System.out.println("Backward Print:");
        list.printBackward(); // Output: 40 30 20 10

        // Delete a node with value 30
        list.delete(30);

        // Print the list after deletion
        System.out.println("After Deletion:");
        list.printForward(); // Output: 10 20 40
    }
}
