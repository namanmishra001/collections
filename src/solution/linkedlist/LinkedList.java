package solution.linkedlist;

public class LinkedList {

	Node head;
	// 1.pehali node jahan hum data rakkhenge

	public void insert(Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		// data add krne k baad check kro ki agar head==null{matlab head pe
		// kutch nahi hai} hai toh fir node pe
		// jo data hai use head pe assingn kr do
		if (head == null) {
			head = node;
		} else {
			// but agar ye jo element add kr rahe ho wo first element nahi hai
			// toh ek nahi node create kro jo is data ko rakhegi ar ye node last
			// me add honi hai par humhe yaha pata nahi ki last node kon si hai
			// so hum first location se itterate krna start krenge and last tak
			// jyenge jab tak null nahi mjil jata hai
			// aur jab mil jye tab node ko head bana do
			Node fNode = head;
			// ab is last added node tak jane k liye aek loop chalao
			while (fNode.next != null) {
				fNode = fNode.next;// jump har agli node pe jab tak null na
									// mile
			}
			fNode.next = node;// as data is added to last so we have to change
								// the
			// reference of last node to newly added one
		}
	}

	public void insertAtBegning(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;// yahan par jo bi value head me hia wo ab agli value
							// ban jyegi
		head = node;// node me jo bi value ayi hai wo head me chali jye par usse
					// phle follow above step
	}

	public void insertAt(int index, Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;// n wali existing node ka address nai node me daal
							// dega
		n.next = node;// ab data change kr do
	}

	public void show() {
		// to travel between nodes we have to start from head
		Node n = head;
		try {
			// if node ka next element agar null nahi hai toh print kr do node k
			// data ko
			while (n.next != null) {
				System.out.println(n.data);
				// data print krne k baad next node pe shift kr do
				n = n.next;
			}
			System.out.println(n.data);// for the last element we r printing
										// data manually
		} catch (NullPointerException npe) {
			System.out.println("null");
		}
	}

}
