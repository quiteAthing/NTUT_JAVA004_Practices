package thread;

public class starPrinter extends Thread {
	String a="";
	StringBuilder acu=new StringBuilder("");
	int ceiling;
	int count;
	public starPrinter(String tok, int level, int cycle){
		a=tok;
		count=level;
		ceiling=cycle;
	}
	@Override
	public void run(){
		for(int s=0;s<count;s++){
		for(int i=0;i<ceiling;i++){
			
				acu.append(a);
				if(this.getName().equals("Thread-0")){
					System.err.println(acu);
				}else{
				System.out.println(acu);
				}
			}
			acu.delete(0,acu.length()-1);
		}
		
		
	}

}
