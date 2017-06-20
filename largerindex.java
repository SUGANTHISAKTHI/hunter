package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class largerindex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int i,j,max=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
		b[i]=a[i];					
				}
		Arrays.sort(a);
		int n1=a[n-1];
		for(i=0;i<n;i++){
			if(b[i]==n1){
				System.out.println("The index is"+i);
				break;
			}
		}
	}

}
