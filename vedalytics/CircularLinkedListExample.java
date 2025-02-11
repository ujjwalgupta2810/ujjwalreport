package vedalytics;

public class CircularLinkedListExample {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularLinkedList {
        Node head;
        Node tail;

        public CircularLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        public void printList() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }

        public void delete(int value) {
            if (head == null) {
                System.out.println("List is empty, cannot delete");
                return;
            }

            Node current = head;
            Node prev = null;

            if (head.data == value) {
                if (head == head.next) {
                    head = null;
                    tail = null;
                } else {
                    tail.next = head.next;
                    head = head.next;
                }
                return;
            }

            do {
                prev = current;
                current = current.next;
                if (current.data == value) {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                    return;
                }
            } while (current != head);

            System.out.println("Node with value " + value + " not found");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Circular Linked List:");
        list.printList();

        list.delete(30);
        System.out.println("After Deleting 30:");
        list.printList();

        list.delete(10);
        System.out.println("After Deleting 10 (head node):");
        list.printList();

        list.delete(40);
        System.out.println("After Deleting 40 (last node):");
        list.printList();

        list.delete(20);
        System.out.println("After Deleting 20 (only node):");
        list.printList();
    }
}
