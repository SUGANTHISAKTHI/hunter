package hunter;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		int p,q;
		System.out.print("Enter the element");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-2;i++){
				for(int j=i+1;j<i+2;j++){
					if(a[j]>a[i]){
					a[i]=a[j];
				}
			}
				a[i+1]=a[i+2];
		}
		for(int k=0;k<n-1;k++){
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<i+2;j++){
				if(a[j]>a[i]){
					a[i]=a[j];
				}
			}
		}
		}
		a[n-1]=0;
		for(int k=0;k<n;k++){
			System.out.println(a[k]);
		}
	}

}
