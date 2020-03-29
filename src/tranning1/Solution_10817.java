package tranning1;

import java.util.Scanner;

public class Solution_10817 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tmp=0;
		int[] num=new int[3];
		for(int i=0;i<3;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(num[i]>num[j]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}	
			}
		}
		System.out.println(num[1]);
	}

}
