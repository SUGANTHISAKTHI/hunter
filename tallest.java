package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class tallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array number");
		int[] a=new int[10];
		int i;
		for(i=0;i<10;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
	for(i=0;i<10;i++){
		if(i==6){
			System.out.println("the 4th tallest student "+a[i]);
		}
	}
		System.out.println("enter the k value");
		int k=s.nextInt();
		for(i=0;i<10;i++){
			if(i==k){
				System.out.println("the k th tallest student height "+a[i]);
			}
		}
			
		
	}

}
