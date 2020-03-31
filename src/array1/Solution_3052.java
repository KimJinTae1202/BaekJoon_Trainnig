package array1;

import java.util.Scanner;

public class Solution_3052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		int count=0;
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			array[i]=n%42;
		}
		sc.close();
		for(int i=0;i<array.length;i++) {
			int cnt=0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
					cnt++;
			}
			if(cnt==0)
				count++;
		}
		
		System.out.println(count);
	}

}
