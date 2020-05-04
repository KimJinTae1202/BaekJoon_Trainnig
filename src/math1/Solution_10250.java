package math1;

import java.util.Scanner;

public class Solution_10250 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int height=0, width=0,number=0;
		
		for(int i=1;i<=n;i++) {
			height=sc.nextInt();
			width=sc.nextInt();
			number=sc.nextInt();
			if((number%height==0))
				System.out.printf("%d%02d\n",height,number/height);
			else
				System.out.printf("%d%02d\n",number%height,(number/height+1));
		}
		sc.close();
		
	}

}
