package solution.linkedlist;

public class App {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.add(5);
		list.add("Naman");
		list.add("Abc");
		list.add("Jeetu");

		list.addBegining("Begin Added");
//
//		list.addAt(1, "newData");

		//list.deleteAt(1);
		
		list.showData();
	}
}
