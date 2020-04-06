package string;

import java.util.Scanner;

public class Solution_11720 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String s=sc.nextLine();
		int sum=0;
		
		for(int i=0;i<n;i++){
			sum+=s.charAt(i)-'0';
		}
		sc.close(); 
		System.out.println(sum);
		 

	}

}
