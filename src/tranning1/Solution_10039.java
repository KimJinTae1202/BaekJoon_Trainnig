package tranning1;

import java.util.Scanner;

public class Solution_10039 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] score= {Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())
				,Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())
				,Integer.parseInt(sc.nextLine())};
		sc.close();
		int sum=0;
		
		for(int i=0;i<score.length;i++) {
			if(score[i]<40)
				score[i]=40;
			sum+=score[i];
		}
		
		System.out.println(sum/5);
	}

}
