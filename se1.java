package scenior;
import java.util.Scanner;
public class se1 {
			public static int output1;
			public static void main( String [] args ) {
			Scanner s=new Scanner(System.in);
				int n=s.nextInt();
			int r,sum=0,sum1=0,sum2=0;
			while(n!=0){
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			while(sum!=0){
				r=sum%10;
				sum1=sum1+r;
				sum2=sum2+sum1;
				sum=sum/10;
			}
			System.out.println(sum2);
			
			}
			
}

