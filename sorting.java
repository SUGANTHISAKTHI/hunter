package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class sorting {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

}
