package string;

import java.util.Scanner;

public class Solution_2675 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String new_s=new String();		
		
		while(n>0) {
			int repeat=sc.nextInt();
			String s=sc.next();
			
			for(int i=0;i<s.length();i++)
				for(int j=0;j<repeat;j++)
					new_s+=s.charAt(i);
			
			new_s+='\n';
			n--;
		}
		sc.close();
		System.out.println(new_s);
	}

}
