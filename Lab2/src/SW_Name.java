import java.util.ArrayList;
import java.util.Scanner;

public class SW_Name {
	//
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
		String[] info=  new String[4];
		ArrayList<String[]> data  = new ArrayList<String[]>();
		Scanner kb = new Scanner(System.in);
		System.out.println("How many names do you want to generate?");
		int c= kb.nextInt();
		for (int i=0; i<c;i++){
			System.out.printf("Enter first name #%d: ",i+1);
			info[0] = kb.nextLine();
			System.out.printf("Enter last name #%d: ",i+1);
			info[1] = kb.nextLine();
			System.out.printf("Enter mom's maiden name #%d: ",i+1);
			info[2] = kb.nextLine();
			System.out.printf("Enter birth city #%d: ",i+1);
			info[3] = kb.nextLine();
		}
				

	}

}
