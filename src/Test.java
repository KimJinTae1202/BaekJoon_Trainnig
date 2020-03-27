import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			String s=new String();
			for(int j=1;j<=i;j++) {
				s+="*";
			}
			System.out.println(s);
		}
	}		
}
