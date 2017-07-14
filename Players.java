package hunter;
import java.util.*;
public class Players {

	public static void main(String[] args) {
		System.out.println("Enter the weigth");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=0;
		if(n%2==0){
			a=n/2;
			b=n/2;
		}else if(n%2==1){
			a=(n/2)+1;
			b=n/2;
		}
		System.out.println("The two team count "+a+" "+b);
		System.out.println("The difference of the two team "+(a-b));

	}

}
