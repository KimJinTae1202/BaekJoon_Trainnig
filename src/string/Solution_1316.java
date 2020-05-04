package string;

import java.util.Scanner;

public class Solution_1316 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=Integer.parseInt(sc.nextLine());
		String s=new String();
		String new_s=new String();
		int sum=0;
		
		for(int i=1;i<=n;i++) { 
			boolean x=true;
			s=sc.nextLine();
			char c=s.charAt(0);
			
			for(int j=1;j<s.length();j++) {
				if(c!=s.charAt(j)) {
					new_s=s.substring(j,s.length());
					if(new_s.indexOf(c)!=-1) {
						x=false;
						break;
					}
					c=s.charAt(j);
				}
			}
			
			if(x)
				sum++;
		}
		 
		System.out.println(sum);
	}

}
