package string;

import java.util.Scanner;

public class Solution_2908 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String new_s1="";
		String new_s2="";
		
		sc.close();
		for(int i=0;i<3;i++) {
			new_s1+=s1.charAt(2-i);
			new_s2+=s2.charAt(2-i);
		}
		int a1=Integer.parseInt(new_s1);
		int a2=Integer.parseInt(new_s2);
		
		System.out.println(a1>a2?a1:a2);
	}

}
