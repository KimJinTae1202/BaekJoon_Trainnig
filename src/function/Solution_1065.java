package function;

import java.util.Scanner;

public class Solution_1065 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(cal_han(n));
		sc.close();
		
	}
	
	
	static int cal_han(int n) {
		int i=0;
		int a=0,b=0,c=0;
		if(n<100)
			return n;
		for(int j=100;j<=n;j++) {
			a=j%10;
			b=j/10%10;
			c=j/100;
			
			if((a-b)==(b-c))
				i++;
		}
		return 99+i;
	}
}
