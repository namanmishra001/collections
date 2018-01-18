package customcollection.arraylist;

public class MyCollection {

	private Object[] objarray = new Object[10];
	private int elementCount;

	// 1. Method One--> add
	public void add(Object object) {
		if (size() == capacity()) {
			increasrCapacity();
		}
		objarray[elementCount] = object;
		elementCount++;
	}

	// 2. Method--> get
	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new ArrayIndexOutOfBoundsException(" " + index);
		}
		return objarray[index];
	}

	// 3. Method--> size
	public int size() {
		return this.elementCount;
	}

	// 4. Method--> replace
	public void replace(int index, Object object) {
		if (index < 0 || index >= size()) {
		}
		objarray[index] = object;
	}

	// 5. Method--> remove
	public void remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(" " + index);
		}
		while (index < size() - 1) {
			objarray[index] = objarray[index + 1];
			index++;
		}
		objarray[index] = null;
		elementCount--;
	}

	// 6. Method--> insert
	public void insert(int index, Object object) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (size() == capacity()) {
			increasrCapacity();
		}
		for (int i = size() - 1; i >= index; i--) {
			objarray[i + 1] = objarray[i];
		}
		objarray[index] = object;
		elementCount++;
	}

	private void increasrCapacity() {
		Object[] nextArray = new Object[capacity() * 2];
		for (int i = 0; i < objarray.length; i++) {
			nextArray[i] = objarray[i];
		}
		objarray = nextArray;
	}

	public int capacity() {
		return objarray.length;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < objarray.length; i++) {
			builder.append(objarray[i]);
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
