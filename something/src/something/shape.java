package something;

public abstract class shape {
	static int shapeCount;
	public shape(){		
	}
	double area;
	static double tArea; 
	public abstract double getArea();
	
	
	
	
	public static double getTotalArea(shape...ha){
		for(shape s : ha){
			tArea+=s.getArea();
		}
		
		return tArea;
	}
	
}
