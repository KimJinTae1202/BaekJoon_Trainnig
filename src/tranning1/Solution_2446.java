package tranning1;

import java.util.Scanner;

public class Solution_2446 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int total_line=2*n-1;
		for(int i=0;i<total_line;i++) {
			if(i<n) {
				for(int j=0;j<i;j++)
					System.out.print(" ");
				for(int j=0;j<total_line-2*i;j++)
					System.out.print("*");
				System.out.println();
			}
			else{
				for(int j=i+1;j<total_line;j++) 
					System.out.print(" ");
				for(int j=0;j<2*(i+1)-total_line;j++)
					System.out.print("*");
				System.out.println();
			}
		}

	}

}
