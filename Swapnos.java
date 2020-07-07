import java.util.*;
public class Swapnos {
	public static void main(String[] args) {
		int x,y;
		Scanner in = new Scanner(System.in);
		x=in.nextInt()	;
		y = in.nextInt()	;
		System.out.println("before swapping");
		System.out.println(x);
		System.out.println(y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping");
		System.out.println(x);
		System.out.println(y);
		
	}

}
