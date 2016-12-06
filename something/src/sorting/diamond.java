package sorting;

public class diamond<T extends Object> implements java.util.Comparator<T>{
	double size;
	double weight;
	double height;
	String shape;
	int price;
	boolean refineable;
	
	public diamond(double size,double weight,double height,int price, String shape){
		this.size=size;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.price=price;
				
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
