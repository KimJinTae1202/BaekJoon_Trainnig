package array1;

import java.util.Scanner;

public class Solution_1546 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0, sum=0;
		double avg=0.0;
		int [] array=new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			if(max<array[i])
				max=array[i];
			sum+=array[i];
		}
		avg=100.0*sum/max/n;
		sc.close();
		System.out.println(avg);		
	}

}
