package array1;

import java.util.Scanner;

public class Solution_2562 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[9];
		int tmp=0,index=0;
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
			if(array[i]>tmp) {
				tmp=array[i];
				index=i+1;
			}		
		}
		sc.close();
		System.out.print(tmp+"\n"+index);

	}

}
