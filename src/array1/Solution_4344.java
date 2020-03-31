package array1;

import java.util.Scanner;

public class Solution_4344 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] array_rate=new double[n];
		
		for(int i=0;i<n;i++) {
			int count=sc.nextInt();
			int sum=0;
			double avg=0.0;
			int rate=0;
			
			int[] array=new int[count];
			
			for(int j=0;j<count;j++) {
				array[j]=sc.nextInt();
				sum+=array[j];
			}
			avg=sum/(double)count;
			
			for(int j=0;j<count;j++) {
				if(array[j]>avg)
					rate++;
			}
			
			array_rate[i]=(double)rate/count*100;
		}
		sc.close();
		
		 for(int i=0;i<array_rate.length;i++)
			 System.out.printf("%.3f%%%n",array_rate[i]);
		 
	}
}

