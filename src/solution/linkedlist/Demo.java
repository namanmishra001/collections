package solution.linkedlist;

public class Demo {

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

	public void addBegining(Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void addAt(int index, Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		if (index == 0) {
			add(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}

	}

	public boolean deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		}
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		Node nextNode = n.next;
		n.next = nextNode.next;
		return true;
	}

	public void showData() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
