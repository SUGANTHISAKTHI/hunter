package hunter;
import java.util.*;
public class Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int n=s.nextInt();
		int m=s.nextInt();
		int mul=0;
		if(n>0&&m>0){
			mul=n*m;
		}
		String str=Integer.toString(mul);
		System.out.println(str);

	}

}
