package guvi;
import java.util.Scanner;
public class Arrayone {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int count;
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(a[i]==a[j]){
					count=count+1;
				}
			}
			if(count==1){
				System.out.println(a[i]);
			}
		}

	}

}
