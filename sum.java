package guvi;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int r,sum=0,sum1=0,sum2=0;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		sum2=sum;
		System.out.println("The sum of number is"+sum);
		while(sum!=0){
			r=sum%10;
			sum1=(sum1*10)+r;
			sum=sum/10;
		}
		System.out.println(sum1);
		if(sum2==sum1){
			System.out.println("The number is palindrome");
		}else{
			System.out.println("The number is not palindrome");
		}

	}

}
