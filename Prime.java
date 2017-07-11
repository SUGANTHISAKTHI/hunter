package hunter;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
        int i,count=0,j;
        int sum=0,sum1=0,sum2=0;
        	for(i=2;i<=n;i++){
        		sum=0;
        		sum=sum+i;
        		sum1=sum;
        		for(j=2;j<sum1;j++){
        			count=0;
        			if(sum1%j==0){
        				count=count+1;
        				break;
        			}
        	}
        		if(count==0){
        			sum2=0;
        			System.out.println(sum1);
        		 sum2=sum%10;
        			if(sum2==3){
        				System.out.println("The last digit "+sum1);
        			}
        		}
        }

	}

}
