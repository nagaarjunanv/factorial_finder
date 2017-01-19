
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int value=scan.nextInt();
		int fact=1;
		while(value!=1)
		{
			fact*=value;
			value--;
		}
		
		System.out.println(fact);
	}

}
