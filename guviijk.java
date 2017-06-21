package Guvi;
import java.util.Scanner;
public class guviijk {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=s.nextInt();
	int[] a=new int[n];
	int i,j,k;
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(k=0;k<n;k++){
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(a[i]+a[j]==a[k]){
				System.out.println("The value are"+a[i]+a[j]+"="+a[k]);
			}
		}
	}
	}

	}

}
