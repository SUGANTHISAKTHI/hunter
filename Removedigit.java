package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Removedigit {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	int i;
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Enter the k digit");
	int k=s.nextInt();
	for(i=0;i<n-k;i++){
		System.out.println(a[i]);
	}
	

	}

}
