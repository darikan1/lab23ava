
public class Info {

	public String date;
	public Product product;
	public Integer count;
	public Info(String date, Product product, Integer count) {
		this.date = date;
		this.product= product;
		this.count = count;
	}
	public Product getProduct() {
		return product;
	}
	public Integer getCount() {
		return count;
	}
	public String getDate() {
		return date;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void showTotalInfo() {
		System.out.printf("|%-10s was solded %-5s  unit of %-15s with total price: %-8s %2s \n", this.date,this.count,this.product.getName(), this.count*this.product.getPrice(), "|");
		
	}
	@Override
	public String toString() {
		
		return this.date +" | "+ product.getName() +" | "+ product.getPrice() +" |";
	}
}
