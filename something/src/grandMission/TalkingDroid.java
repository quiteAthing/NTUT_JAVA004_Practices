package grandMission;

import something.*;
import java.util.Scanner;

public class TalkingDroid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Personal practice project
		//��J ��r�åB�L�X��
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
