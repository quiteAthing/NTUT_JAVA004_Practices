package thread;

public class Mthread {
	
	public static void main(String[] args){
		starPrinter sp=new starPrinter("X",999,7);
		starPrinter spp=new starPrinter("#",5836,15);
		starPrinter spa=new starPrinter("5",3666,9);
		starPrinter spb=new starPrinter("H",3786,20);
		starPrinter spc=new starPrinter("@",8836,6);
		Thread i1=new Thread(new starPrinterRunnable("K",36,5));
		i1.start();
		sp.start();
		spp.start();
		try {
			spp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		spc.start();
		spa.start();
		spb.start();
		
		
	}

}
