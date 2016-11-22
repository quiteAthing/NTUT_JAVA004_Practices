package grandMission;

public class Box  implements Comparable<Box>{

	// 變數型態 變數名稱 = 初值 ;
	int width;
	int depth;
	int height;
    
	public Box(int width, int depth, int height) {
		super();
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	public double getSurfaceArea() {
		return 2 * (width * depth + depth * height + width * height);
	}
	public double getVolume() {
		return width * depth * height;
	}

	@Override
	public int compareTo(Box o) {
		// TODO Auto-generated method stub
		Double compareW=o.getVolume();
		Double compa=this.getVolume();
		if(compareW<compa){
			return 1;
		}else if(compareW>compa){
			return -1;
		}else{return 0;}
				
	}
}