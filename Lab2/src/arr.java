import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arr {
	//coments
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cs = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		Scanner kb = new Scanner(System.in);
		int c=0;
		cs.add("CPSC125");
		cs.add("CPSC405");
		cs.add("CPSC220");
		cs.add("CPSC106");
		cs.add("CPSC240");
		cs.add("CPSC225");
		cs.add("CPSC326");
		cs.add("CPSC110");
		cs.add("CPSC430");
		cs.add("CPSC350");
		cs.add("CPSC491");
		
		temp.addAll(cs);		
		Collections.sort(cs);
		for(int i=0;i<cs.size();i++){
			if (cs.get(i) == temp.get(i)) c++;
		}
		
		System.out.printf("Sorted entries %d %n", cs.size()-c);
		System.out.print("Enter CPSC class number in format CPSC###: ");
		String s= kb.nextLine();
		s=s.toUpperCase();
		
		if(cs.contains(s)){
			System.out.println("Class found");
		}else{
			System.out.println("Class not found");
		}
			
		
	}

}
