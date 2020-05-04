package math1;

import java.util.Scanner;

public class Solution_2869 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		sc.close();
		
		int day=h<a?1:(int) Math.ceil((h-a)/(a-b))+1;
		System.out.println(day);
		
		}
		
	}
