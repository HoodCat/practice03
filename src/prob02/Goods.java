package prob02;

public class Goods {
	private String name;
	private int price;
	private int stock;
	
	public Goods(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public Goods(String name, String price, String stock) {
		this(name, Integer.valueOf(price), Integer.valueOf(stock));
	}
	
	public void showInfo() {
		System.out.println(
				String.format("%s(가격:%d원)이 %d개 입고 되었습니다.",
						name, price, stock));
	}
}
