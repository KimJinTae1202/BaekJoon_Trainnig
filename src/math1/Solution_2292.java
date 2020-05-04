package math1;

import java.util.Scanner;

public class Solution_2292 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//19
		sc.close();
		int x=1;
		
		if(n==1) {
			System.out.println(n);
			return;
		}
		
		while(true) {
			if(n>3*(x-1)*x+1 && n<=(3*x)*(x+1)+1) {
				System.out.println(x+1);
				break;
			}
			x++;
		}

	}

}
