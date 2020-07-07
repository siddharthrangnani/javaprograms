import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,h,answer=0,b;
		Scanner in = new Scanner (System.in);
		l = in.nextInt();
		h=in.nextInt();
		b=in.nextInt();
		answer=l*b*h;
		System.out.println("Your volume of cube  is"+answer);
		

	}

}
