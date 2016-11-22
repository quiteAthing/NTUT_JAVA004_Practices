package something;

import java.io.*;

public class IOpra {
	public static void main(String[] args){
		String strIn="";
		File f=new File("D:\\_Java","domian.txt");
		File d=new File("D:\\_Java","dobian.txt");
			try(
					FileInputStream fis=new FileInputStream(f);
					FileOutputStream fo=new FileOutputStream(d);
					
					){
				BufferedInputStream bi=new BufferedInputStream(fis,819200);
				byte[] a=new byte[(int)f.length()];
				fis.read(a);
				for(Byte b :a){
					char c=(char)b.intValue();
					strIn+=c;
				}
				System.out.println(strIn);
				fo.write(a, 0,a.length);
				
			}catch( Exception e){
				e.printStackTrace(System.out);
				
			}
		
	}

}
