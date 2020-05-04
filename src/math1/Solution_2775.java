package math1;

import java.util.Scanner;

public class Solution_2775 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=0,w=0;
		for(int i=1;i<=n;i++) {
			h=sc.nextInt();
			w=sc.nextInt();
			System.out.println(cal_num(h,w));
		}
		sc.close();	
	}
	public static int cal_num(int a, int b) {
		if(a==0||b==1)
			return b;
		else
			return cal_num(a-1,b)+cal_num(a,b-1);
	}

}
