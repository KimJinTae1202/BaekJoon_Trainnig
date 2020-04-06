package string;

import java.util.Scanner;

public class Solution_10809 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		for(char c='a';c<='z';c++) {
			System.out.print(s.indexOf(c)+" ");
		}

	}

}
