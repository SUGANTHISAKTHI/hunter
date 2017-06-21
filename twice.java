package Guvi;
import java.util.Scanner;
public class twice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j,count=0,flag=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count==1){
				System.out.println(a[i]);
			}else{
				flag++;
			}
		}
		if(flag==n){
			System.out.println("There is no element in occured in one time");
		}

	}

}
