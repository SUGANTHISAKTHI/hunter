package guvi;
import java.util.Scanner;
public class Repeated {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j,sa;
		int[] b=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
        if(a[i]==a[i+1]){
	System.out.println(a[i]);
}
			 
}
	}

}
