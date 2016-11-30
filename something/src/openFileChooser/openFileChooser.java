package openFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javax.swing.JFileChooser;


public class openFileChooser {
	
	public static void main(String[] args){
		JFileChooser jfc=new JFileChooser();
		//jfc.setDialogTitle("Open---------");
		jfc.showOpenDialog(null);
		
		File k=jfc.getSelectedFile();
		try(
				BufferedReader bfr=new BufferedReader(new InputStreamReader(new FileInputStream(k),Charset.forName("utf-8")));
				){
				String j=bfr.readLine();
				System.out.println(j);
			
		}catch(Exception e){}
		
		
	}

}
