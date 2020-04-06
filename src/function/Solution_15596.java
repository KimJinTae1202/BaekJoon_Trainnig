package function;

import java.util.Scanner;

public class Solution_15596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sc.close();
		
		long result=sum(a);
		System.out.println(result);
	}

	  static long sum(int[] a) {
		  int sum=0;
		  for(int i=0;i<a.length;i++)
			  sum+=a[i];
		  return sum;
	  }
	 

}
