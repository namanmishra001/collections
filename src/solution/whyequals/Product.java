package solution.whyequals;

public class Product {
	int pid, price;

	public Product(int pid, int price) {
		this.pid = pid;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		int id1 = this.pid;
		int pr1 = this.price;

		Product pro = (Product) obj;
		int id2 = pro.pid;
		int pr2 = pro.price;
		if (id1 == id2 && pr1 == pr2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Product product1 = new Product(001, 10000);
		Product product2 = new Product(001, 10000);
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product1.equals(product2));
	}
}
