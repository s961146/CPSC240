import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SW_Name {
	
	public static int countVowels(String S){
		int c=0;
		S = S.toLowerCase();
		for (int  i=0;i<S.length();i++){
			char ch= S.charAt(i);
			if (ch == 'a' || ch=='e' ||ch == 'i'|| ch=='o'||ch=='u')
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info=  new String[2];
		ArrayList<String[]> data  = new ArrayList<String[]>();
		ArrayList<Integer> vowelCount = new ArrayList<Integer>();
		Scanner kb = new Scanner(System.in);
		System.out.println("How many names do you want to generate?");
		int c= kb.nextInt();
		kb.nextLine();
		for (int i=0; i<c;i++){
			System.out.printf("Enter first name #%d: ",i+1);
			String firstName = kb.nextLine(); 
			System.out.printf("Enter last name #%d: ",i+1);
			String lastName = kb.nextLine();
			System.out.printf("Enter mom's maiden name #%d: ",i+1);
			String maidenName = kb.nextLine();
			System.out.printf("Enter birth city #%d: ",i+1);
			String city = kb.nextLine();
			System.out.println();
			info[0] = firstName.substring(0,3) + lastName.substring(0, 2);
			info[0] = info[0].substring(0, 1).toUpperCase() + info[0].substring(1).toLowerCase();
			info[1] = maidenName.substring(0,2) + city.substring(0,3);
			info[1] = info[1].substring(0, 1).toUpperCase() + info[1].substring(1).toLowerCase();
			data.add(new String[]{info[0],info[1]});
			vowelCount.add(countVowels(info[0]+info[1]));
			//for test
			//System.out.printf("%s    %s   %d%n",info[0],info[1],countVowels(info[0]+info[1]) );
			
		}
		int m = Collections.max(vowelCount);
		//For test
		//System.out.printf("%d%n",m);
		
		for (int i=0; i<c;i++){
			info = data.get(i);
			if(m == vowelCount.get(i)){
				System.out.printf("#%d %s %s the Great%n",i+1,info[0],info[1]);
			}else{
				System.out.printf("#%d %s %s%n",i+1,info[0],info[1]);
			}
			
		}

	}

}
