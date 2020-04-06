package string;

import java.util.Scanner;

public class Solution_1157 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toUpperCase();
		sc.close();
		
		int[] array=new int[26];//97-122
		int max=0;
		char result='?';
		for(int i=0;i<s.length();i++) {
			array[s.charAt(i)-65]++;
			if(max<array[s.charAt(i)-65]) {
				max=array[s.charAt(i)-65];
				result=s.charAt(i);
			}else if(max==array[s.charAt(i)-65])
				result='?';
				
		}
		System.out.println(result);
		
		
		
	}

}
