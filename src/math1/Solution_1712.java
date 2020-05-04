package math1;

import java.util.Scanner;

public class Solution_1712 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		sc.close();
		if(C>B) {
			System.out.println(A/(C-B)+1);
		}else
			System.out.println(-1);
		
	}

}
