import java.util.Scanner;
public class Simpleint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,r,n,answer=0;
		Scanner in = new Scanner (System.in);
		p = in.nextInt();
		r=in.nextInt();
		n=in.nextInt();
		answer=(p*r*n)/100;
		System.out.println("simple Interest"+answer);
		

	}

}
