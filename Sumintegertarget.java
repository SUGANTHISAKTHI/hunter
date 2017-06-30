package guvi;
import java.util.Scanner;
public class Sumintegertarget {
public static	void  display(int sum,int target){
		if(sum==target){
			System.out.println("TRUE");
		}
		if(sum!=target){
		System.out.println("FALSE");
	}

}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		System.out.println("Enter the array elements in the arrays");
		int i,j;
		int sum=0;
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println("Enter the target number");
		int target=s.nextInt();
		Sumintegertarget t=new Sumintegertarget();
		t.display(sum, target);
		

		
	}

}

