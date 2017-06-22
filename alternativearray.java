package guvi;
import java.util.Scanner;
public class alternativearray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("Enter the array element");
		int i,j=0,k=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=n-1;i>=n/2;i--){
		 b[k]=a[i];
		  k++;
		  b[k]=a[j];
		 k++;
		  j++;
		}
		for(i=0;i<n;i++){
			System.out.println(b[i]);
		}
	}

}
