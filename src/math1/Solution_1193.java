package math1;

import java.util.Scanner;

public class Solution_1193 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		while(true) {
			if(n>x*(x-1)/2 && n<=x*(x+1)/2)
				break;
			x++;
		}
		int a=n-x*(x-1)/2;
		String s=x%2==0?a+"/"+(x+1-a):(x+1-a)+"/"+a;
		System.out.println(s);
		sc.close();

	}

}
