package Tamilnadu;
import java.util.Scanner;
public class Subarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,max=0,sum=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("The array value is");
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
		System.out.println("Enter the size of the subarray");
		int m=s.nextInt();
		int j;
		int k=0;
		int p=n/m;
		int size=m;
		for(i=0;i<p;i++){
			sum=0;
			for(j=k;j<size;j++){
				sum=sum+a[j];
			}
			if(max<sum){
				max=sum;
			}
		k=size;
			size=size+m;
		}

		System.out.println(max);
	}

}
