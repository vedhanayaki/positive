package positive;
import java.util.Scanner;
public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println("positive");
		}
		if(a<0)
		{
			System.out.println("negative");
		}
		if(a==0)
		{
			System.out.println("zero");
		}

	}

}
