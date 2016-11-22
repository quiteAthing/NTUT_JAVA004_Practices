package something;

public class triangle extends shape{
	double width,height;
	static int count=0;
	static{
		count+=1;
		
	}
	public triangle(double wid,double heig){
		width=wid;
		this.height=heig;
		shape.shapeCount+=1;
	}
		
	public double getArea(){
		area=0.5*width*height;
		
		return area;
	}
	

}
