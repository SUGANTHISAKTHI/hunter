package hunter;
import java.util.*;
public class PrimeTwo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int i,j,count=0;
	int[] a=new int[21];
	int k=0;
	for(i=0;i<=n;i++){
		count=0;
		for(j=2;j<i;j++){
			if(i%j==0){
				count=1;
				break;
			}
		}
		if(count==0){
			if(i>9&&i<100){
			a[k]=i;
			k++;
			//System.out.println(i);
		}
			
	}}
	int sum=0;
	int count1=0;
	for(i=0;i<a.length;i++){
		sum=0;
		count1=0;
		for(k=0;k<n;k++){
			sum=sum+a[i];
			count1++;
			if(sum==n){
				//System.out.println(sum+" "+count1+" "+a[i]);
			for(int p=0;p<count1;p++){
					System.out.print(a[i]+" ");
				break;
			}
			}
		}
		for(j=0;j<a.length;j++){
			if(a[i]+a[j]==n){
				System.out.println(a[i]+" "+a[j]);
				continue;
			}
		}
	}

	}

}
