package math1;

import java.util.Scanner;

public class Solution_2775_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=0,w=0,result=0;
		for(int i=1;i<=n;i++) {
			h=sc.nextInt();
			w=sc.nextInt();
			for(int j=1;j<=w;j++) {
				result+=(w*(w+1)/2)*j;
				
			}
			System.out.println(result);
		}
		sc.close();	
	}

}
