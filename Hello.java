import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int a = ob.nextInt();
		int b = ob.nextInt();
		int c = ob.nextInt();
		int d = ob.nextInt();
		int e = ob.nextInt();
		int answer = 0;
		int ave= 5;
		answer = (a+b+c+d+e) /ave;
		System.out.println("Answer of average is"+" "+answer);
		

	}

}
