import java.util.*;
public class Generateprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,status=1,num=3;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to generate prime nos");
		n=in.nextInt();
		if(n>=1)
		{	System.out.println("Prime Numbers are");
		System.out.println(2);
		
			
		}
		for(int count = 2;count<=n;)
		{
			for(int j =2;j<=Math.sqrt(num);j++)
			{if(num%j==0)
			{
				status = 0;
				break;
			}
			}
			if(status!=0)
			{System.out.println(num);
			count++;
			}
			status=1;
			num++;
			
		}
		

	}

}
