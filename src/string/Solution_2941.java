package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] array= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int sum=s.length();
		
		for(int i=0;i<array.length;i++) {
			if(s.contains(array[i])) {
				s=s.replace(array[i], "&");
			}
		}
		System.out.println(s);
		System.out.println(s.length());
	
		
		
	}

}
