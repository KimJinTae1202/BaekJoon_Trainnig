package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2839 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());//11
			int a=n/5;//2
			int b=n-a*5;//1
			
			if(n%5==0)
				System.out.println(a);
			else {
				while(true) {
					if(a>=0&&b%3==0) {
						System.out.println((a+b/3));
						break;
					}
					else if(a==0 && b%3!=0) {
						System.out.println(-1);
						break;
					}
					a--;
					b=n-a*5;
					}	
			}				
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
