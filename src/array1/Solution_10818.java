package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int length=Integer.parseInt(br.readLine());
		int[] array=new int[length];
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		
		for(int i=0;i<length;i++)
			array[i]=Integer.parseInt(st.nextToken());
		int min=array[0];
		int max=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
			else if(array[i]<=min)
				min=array[i];
		}
		System.out.println(min+" "+max);
	}

}
