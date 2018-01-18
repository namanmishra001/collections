package customcollection.stack;

public class App {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(18);
		stack.push(19);
		stack.push(20);
		//System.out.println("value removed "+stack.pop());
		//System.out.println("called peek and u get "+stack.peek());
		System.out.println("is stack empty..? "+ stack.isEmpty());
		stack.printStack();
	
	}
}
