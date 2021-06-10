
public class Product {

	private String Name;
	private Integer Price;
	public Product(String Name, Integer Price) {
		this.Name = Name;
		this.Price = Price;
	}
	public String getName() {
		return Name;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	
}
