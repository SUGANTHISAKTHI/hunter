package guvi;
import java.util.Scanner;
public class printsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,sum=0,r,k=0;
		int sum1=0;
		while(n!=0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		while(sum!=0){
			r=sum%10;
			j=1;
			for(i=0;i<k;i++){
				j=j*r;
			}
			k++;
			sum1=sum1+j;
			sum=sum/10;
		}
		System.out.println(sum1);

	}

}
