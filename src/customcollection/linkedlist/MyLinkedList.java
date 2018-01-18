package customcollection.linkedlist;

public class MyLinkedList {

	Node head;

	public void add(Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void addFirst(Object data) {

		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void add(int index, Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node n = head;
		if (index == 0) {
			node.next = head;
			head = node;
		} else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void delete(int index) {
		if(index==0){
			head.next=head;
		}
		else{
			Node n = head;
			for(int i=0;i<index-1;i++){
				n=n.next;
			}
			Node next = n.next;
			n.next = next.next;
		}
	}

	public void printList() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
