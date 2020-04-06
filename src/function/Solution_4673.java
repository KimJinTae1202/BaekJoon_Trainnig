package function;

public class Solution_4673 {

	public static void main(String[] args) {
		boolean create_array[]=new boolean[10001];
		for(int i=1;i<create_array.length;i++) {
			int d=create_f(i);
			if(d<create_array.length)
				create_array[d]=true;
		}
		for(int i=1;i<create_array.length;i++)
			if(!create_array[i])
				System.out.println(i);
	
	}
	static int create_f(int n) {
		int create_n=n;
		while(n>0) {
			create_n+=n%10;
			n=n/10;
		}
		return create_n;
	}
	
}
