package array1;

import java.util.Scanner;

public class Solution_8958 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int sum=0;
		int count=0;
		int[] array=new int[n];
		
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			for(int j=0;j<s.length();j++) {
				char x=s.charAt(j);
				if(x=='O')
					sum+=++count;
				else 
					count=0;
			}
			array[i]=sum;
			sum=0;
			count=0;
		}
		
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		sc.close();
	}

}
