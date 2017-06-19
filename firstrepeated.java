package Guvi;
import java.util.Scanner;
public class firstrepeated {
	public  static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,r=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n-2;i=i+2){
			if(a[i]==a[i+1]){
				r=a[i];
			}
		}
		System.out.println(r);
	}
}
