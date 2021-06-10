import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Product product1 = new Product("Iphone 11", 25000);
		Product product2 = new Product("MacBook Pro", 70000);
		Product product3 = new Product("Airpods Pro", 8000);
		List<Info> infoList = new ArrayList<Info>();
		infoList.add(new Info("01.06.2021",product1,53));
		infoList.add(new Info("01.05.2021",product2,23));
		infoList.add(new Info("01.04.2021",product2,433));
		infoList.add(new Info("01.03.2021",product3,345));
		infoList.add(new Info("01.02.2021",product3,543));
		infoList.add(new Info("01.01.2021",product1,43));
		
		for (Info info : infoList) {
			info.showTotalInfo();
		}
		infoList.sort(new PriceSorter());
		System.out.println("--------------------SORTED--------------------------");
		
		for (Info info : infoList) {
			info.showTotalInfo();
		}
	}

}
