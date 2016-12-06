package sorting;

public class plane<T extends Object> implements java.util.Comparator<T> {
	double weight;
	String type;
	String serial;
	double length;
	double height;
	double wingspan;
	int capacity;
	int price;
	public plane(double weight, String type, String serial, double length, double height, double wingspan, int capacity,
			int price) {
		this.weight = weight;
		this.type = type;
		this.serial = serial;
		this.length = length;
		this.height = height;
		this.wingspan = wingspan;
		this.capacity = capacity;
		this.price = price;
	}
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
