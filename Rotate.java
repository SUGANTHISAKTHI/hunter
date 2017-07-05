package hunter;
import java.util.Scanner;
public class Rotate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		System.out.println("Enter the arrays value");
		int[] a=new int[n];
		int[] b=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	System.out.println("Enter the rotate size of the array");
		int r=s.nextInt();
		int j=r,m=n-r;
		for(i=0;i<m;i++){
				b[i]=a[j];
				j++;
			}
		int k=0;
		for(i=m;i<n;i++){
			b[i]=a[k];
			k++;
		}
		for(i=0;i<n;i++){
			System.out.println(b[i]);
		}
	}

}
