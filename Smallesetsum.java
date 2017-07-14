package hunter;
import java.util.*;
public class Smallesetsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int sum=0,sum1=0;
		int b=0,c=0;
				for(int i=0;i<n;i++){
					sum1=sum1+a[i];
				}
				int min=Math.abs(sum1);
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				sum=0;
				sum=Math.abs(a[i]+a[j]);
				if(min>sum){
				min=sum;
				b=a[i];
				c=a[j];
				}
		}
		}
		System.out.println("The element are"+b+" "+c);
	}

}
