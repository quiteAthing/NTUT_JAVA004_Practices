package something;

public class wtf {
	int n=50000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		triangle s=new triangle(15,10.9);
		triangle r=new triangle(25,88.1123);
		triangle w=new triangle(19,15.775);
		triangle q=new triangle(19,15.12);
		triangle f=new triangle(19,15.887999);
		triangle b=new triangle(19,15.557);
		System.out.print("total area : ");
		System.out.printf("%2f",shape.getTotalArea(s,r,w,q,f,b));
		trian(f);
		wtf wt=new wtf();
		System.out.println(wt.n);
		System.out.println(shape.shapeCount);

	}
	
	public static void trian (shape sh){
		System.out.println(sh.getArea()+"  "+sh.getClass().getName() );
		
	}

}
