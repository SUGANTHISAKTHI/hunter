package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Minmax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j,max=0,min=0;
		int p=0,q=0,r=0,t=0;
		System.out.println("Enter the array element");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
		System.out.println("minimum number"+a[0]+a[1]);
		System.out.println("Maximum number"+a[0]+a[n-1]);
		

	}

}
