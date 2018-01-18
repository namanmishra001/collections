package customcollection.linkedlist;

public class runner {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("a");
		list.add("b");
		list.addFirst("First");
		list.add(1, "Second");
		list.delete(2);
		list.printList();
	}
}
