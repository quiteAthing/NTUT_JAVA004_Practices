package fileIOtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class fileTest {
	public static Map<String,String> iniOpts=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File someINI=new File("files/someini.ini");
		
		try(FileInputStream fis =new FileInputStream(someINI);
			BufferedReader bfr=new BufferedReader(new InputStreamReader(fis,Charset.forName("utf-8")));
			)
		{
			String reading="";
			while(reading!=null){
			reading=bfr.readLine();
			if(reading!=null){
				String[] tmp=reading.split("=");
				iniOpts.put(tmp[0],tmp[1]);	
			}
			
		}
			} catch (Exception e) {
			e.printStackTrace();
		} 
			for(String  s:iniOpts.keySet()){
				System.out.println("key =  "+s+"   :   "+iniOpts.get(s));
			}
			
		//輸出資料到檔案，路徑為ini檔中指示的路徑
			try{
				String fName="Fot.txt";
				String fNameFull=iniOpts.get("DefaultSaveLocation")+"\\"+fName;
				File out=new File(fNameFull);
				FileOutputStream fos=new FileOutputStream(out,false);
				BufferedWriter bfw= new BufferedWriter(new OutputStreamWriter(fos));
				bfw.write("default");
				bfw.close();
				
			
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
	}

}
