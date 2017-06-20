package Guvi;
import java.util.Scanner;
public class product {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("Enter the size ");
int n=s.nextInt();
int[] a=new int[n];
int i,j,max=0;
int p=0,q=0;
for(i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(i=0;i<n-1;i++){
	for(j=1;j<n;j++){
		if((a[i]*a[j])>max){
			max=(a[i]*a[j]);
			p=a[i];
			q=a[j];
		}
	}
}
System.out.println("The integer is"+p+q);

	}

}
