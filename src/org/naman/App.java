package org.naman;

public class App {

	public static void main(String[] args) {
		MyCollection customeCollection = new MyCollection();
		System.out.println("Capacity: "+customeCollection.capacity());
		System.out.println("Size: "+customeCollection.size());
		
		customeCollection.add("Naman");
		customeCollection.add(1);
		customeCollection.add(3.6);
		customeCollection.add(null);
		customeCollection.add(true);
		customeCollection.add("Naman");
		customeCollection.add(1);
		customeCollection.add(3.6);
		customeCollection.add(null);
		customeCollection.add(true);
		customeCollection.add("a");
		customeCollection.get(2);
		customeCollection.insert(4, "Insert");
		customeCollection.remove(1);
		customeCollection.replace(6, "Replace");
		
		
		System.out.println(customeCollection);
		System.out.println("Capacity:"+customeCollection.capacity());
		System.out.println("Size: "+customeCollection.size());
	
	}

}
