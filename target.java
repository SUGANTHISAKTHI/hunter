package guvi;
import java.util.Scanner;
public class target {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		System.out.println("enter the number");
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter the target number");
		int t=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
			if(a[i]+a[j]==t){
				System.out.println("The two numbers are"+a[i]+a[j]);
				break;
			}
		}
		}

	}
}
