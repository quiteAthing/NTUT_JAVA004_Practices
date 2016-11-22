package grandMission;


import java.util.*;


public class CompareBox {
	public static void main(String[] args){
		Box[] boxes=new Box[10];
		for(int w=0;w<boxes.length;w++){
			boxes[w]=new Box((int)(Math.random()*10)+1,(int)(Math.random()*10)+1,(int)(Math.random()*10)+1);
			System.out.println("generated boxes :"+boxes[w].getVolume()+"     index : "+w);
		}
		List<Box> camp=new ArrayList<>();
		for(Box x :boxes){camp.add(x);}
		Collections.sort(camp);
		for(Box a:camp){
			System.out.println(a.getVolume()+" ,index:  "+ camp.indexOf(a));	
		}
		
		
		
		
	}

}
