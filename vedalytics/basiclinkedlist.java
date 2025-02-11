package vedalytics;

public class basiclinkedlist {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node a = new Node(5);
Node b = new Node(6);
Node c = new Node(7);
a.next = b;
b.next = c;
System.out.println(a.next);
System.out.println(b.data);
	}

}
