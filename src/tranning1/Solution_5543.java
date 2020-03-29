package tranning1;

import java.util.Scanner;

public class Solution_5543 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int burger=2000;
		int drink=2000;
		
		for(int i=0;i<3;i++) {
			int a=sc.nextInt();
			if(burger>a)
				burger=a;	
		}
		sc.close();
		for(int i=0;i<2;i++) {
			int a=sc.nextInt();
			if(drink>a)
				drink=a;	
		}
		System.out.println((burger+drink-50));

	}

}
