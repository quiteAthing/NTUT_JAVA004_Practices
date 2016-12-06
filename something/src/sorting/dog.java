package sorting;

public class dog<T extends Object> implements java.util.Comparator<T>{
	
	double weight;
	double height;
	String name;
	int price;
	String bark;
	public dog(double weight, double height, String name, int price, String bark) {
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.price = price;
		this.bark = bark;
	}
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
