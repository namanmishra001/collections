package customcollection.stack;

public class Stack {

	private Object[] objArray = new Object[10];
	private int top = 0;

	public void push(Object data) {
		if (size() == capacity()) {
			increaseCapacity();
		}
		objArray[top] = data;
		top++;
	}

	public Object pop() {
		if (size() == 0) {
			System.out.println("Stack is empty");
		}
		top--;//we have to reduce bcoz after storing data its value get incremented by 1 thats y it got stopped
		Object data = objArray[top];
		objArray[top] = null;
		return data;
	}

	public Object peek() {
		return objArray[top - 1];
	}
	public boolean isEmpty(){
		if(size()==0){
		return true;
		}
		else{
			return  false;
		}
	}

	private void increaseCapacity() {
		Object[] newArray = new Object[capacity() * 2];
		//System.arraycopy(objArray, 0, newArray, 0, objArray.length*2);
		for (int i = 0; i < objArray.length; i++) {
			newArray[i] = objArray[i];
		}
		objArray = newArray;
	}

	private int size() {
		return this.top;
	}

	private int capacity() {
		return this.objArray.length;
	}

	public void printStack() { 
		System.out.print("Elements : ");
		for (Object displayData : objArray) {
			System.out.print(displayData + " ");
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < objArray.length; i++) {
			builder.append(objArray[i]);
			builder.append(",");
		}
		if (size() != 0) {
			int start = builder.lastIndexOf(",");
			int end = start + 2;
			builder.delete(start, end);
			builder.append("]");
		}
		return builder.toString();
	}
}
