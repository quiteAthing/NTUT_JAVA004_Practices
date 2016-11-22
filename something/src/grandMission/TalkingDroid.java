package grandMission;

import something.*;
import java.util.Scanner;

public class TalkingDroid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Personal practice project
		//輸入 文字並且印出來
		Scanner scr= new Scanner(System.in);
		String[] s={};
		Talk t=new Talk();
		try{
		System.out.println(t.takeString(scr.nextLine(),3));}
		catch(Exception e){
			e.printStackTrace(System.out);
		}

	}
}
