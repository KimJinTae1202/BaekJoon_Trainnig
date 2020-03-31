package array1;

import java.util.Scanner;

public class Solution_2577 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=1;
		int tmp=0;
		int[] num_array= {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=1;i<=3;i++)
			x*=sc.nextInt();
		sc.close();
		while(x>0) {
			tmp=x%10;
			num_array[tmp]++;
			x/=10;
		}
		for(int i=0;i<num_array.length;i++)
			System.out.println(num_array[i]);
		
		
	}

}
