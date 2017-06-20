package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class price {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		System.out.println("Enter the Stock price");
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		j=a[n-1]-a[0];
		System.out.println("Max benefits of the price is"+j+"thousand");
	}

}
