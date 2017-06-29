package guvi;
import java.util.Scanner;
public class primebetweentwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,flag,sum=0,k,sum1=0,n1=0;
		int[] a=new int[n];
		int[] b=new int[n];
		int count = 0;
		int n2=0;
		int num=0;
		int count1=0;
		int r=0;
		for(i=2;i<n;i++){
			flag=0;
			for(j=2;j<i;j++){
			if(i%j==0){
		      flag=1;
		       break;
					}
			}
			if(flag==0){
				a[i]=i;
			}
		}
		int p=0,q=0;
				for(i=0;i<a.length;i++){
					if(a[i]!=0){
						r=a[i];
						count=1;
						for( k=0;k<a.length;k++){
							if(a[k]!=0){
								if(a[i]+a[k]==n){
									count=count+1;
									p=a[i];
									q=a[k];
									
								}
							}
						}
					}
				}
	
				System.out.println(count);
					System.out.println(p+" "+q);
				
		
	}
}
	


