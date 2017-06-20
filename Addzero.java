package guvi;
import java.util.Scanner;
public class Addzero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the Array element");
		int i;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			if(a[i]+a[i+1]==0){
				System.out.println("The two integer are"+a[i]+a[i+1]);
			}
		}

	}

}
