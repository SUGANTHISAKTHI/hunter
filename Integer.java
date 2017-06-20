package guvi;
import java.util.Scanner;
public class Integer {
static 	void integer(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(j==a[i]){
					System.out.println("the array index is"+j);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		integer();
		
	}

}
