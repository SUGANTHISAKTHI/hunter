package guvi;
import java.util.Scanner;
public class NewArray {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=s.nextInt();
	System.out.println("Enter the array elements are");
	int i;
	int[] a=new int[n];
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	/*for(i=0;i<n;i++){
		System.out.println(a[i]);
	}*/
	System.out.println("Enter the number");
	int remove=s.nextInt();
	int[] b=new int[n];
	for(i=0;i<n;i++){
		if(a[i]!=remove){
			b[i]=a[i];
		}
	}System.out.println("The new array elements are");
	for(i=0;i<n;i++){
		if(b[i]!=0){
			System.out.println(b[i]);
		}
	}
	}
}
