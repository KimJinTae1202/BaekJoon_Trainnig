package tranning1;

import java.util.Scanner;

public class Solution_10996 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=2*n;i++) {
			if((i%2)!=0) {
				for(int j=1;j<=n;j++) {
					if((j%2)!=0)
						System.out.print("*");
					else
						System.out.print(" ");
				}	
			}else {
				for(int j=1;j<=n;j++) {
					if((j%2)!=0)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * StringBuilder sb = new StringBuilder(); int n = sc.nextInt(); for(int i=0;
	 * i<n; i++){ if (n==1) { sb.append("*"); break; } for(int j=0; j<2; j++){
	 * for(int k=0; k<n; k++){ if(j==0 && k%2==0 || j==1 && k%2==1) sb.append("*");
	 * else sb.append(" "); } sb.append("\n"); } } System.out.print(sb); }
	 */
	//StringBuilder 로 2개의 패턴으로 규칙을 표현하는 방법.
	//메모리와 시간이 가장 절약됨 왜냐하면 프린트문이 반복되지 않음
	//시간은 N**2에서 N 으로 줄어듬..
	
}