import java.util.Comparator;

public class PriceSorter implements Comparator<Info> {

	 @Override
	    public int compare(Info o1, Info o2) {
		 Integer a1=o1.getProduct().getPrice()*o1.count;
		 Integer a2 = o2.getProduct().getPrice()*o2.count;
	        return  a1.compareTo(a2);
	    }
}
