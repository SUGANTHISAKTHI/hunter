package hunter;
import java.util.*;
public class MaxSubArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int p=0,q=0,r=0,sum=0,max=0;
		if(n%3==0){
			for(int i=0;i<n;i=i+3){
				sum=0;
				for(int j=i;j<i+3;j++){
					sum=sum+a[j];
				}
				if(max<sum){
					max=sum;
					p=a[i];
					q=a[i+1];
					r=a[i+2];
				}
			}
			System.out.println(max+" "+p+" "+q+" "+r);
			
		}
		else if(n%3!=0){
			int u=0,v=0,w=0;
			for(int i=0;i<n-2;i=i+2){
				sum=0;
				for(int j=i;j<i+3;j++){
					sum=sum+a[j];
				}
				if(max<sum){
					max=sum;
					u=a[i];
					v=a[i+1];
					w=a[i+2];
					System.out.println("hi"+max+" "+u+" "+v+" "+w);
					}
			}
		
		
		int max1=0;
		max1=a[n-1]+a[n-2];
		int k=a[n-1];
		int l=a[n-2];
		if(max1<max){
		System.out.println(max+" "+u+" "+v+" "+w);
		}
		if(max1>=max){
			System.out.println(max1+" "+k+" "+l);
		}
		}
		
	}

}
