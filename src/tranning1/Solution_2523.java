package tranning1;

import java.util.Scanner;

public class Solution_2523 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        sc.close();
		for(int i=1;i<=2*a-1;i++) {
			if(i<=a) {
				for(int j=1;j<=i;j++)
					System.out.print("*");
				System.out.println();
			}
			else {
				for(int j=i;j<=2*a-1;j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}

}
