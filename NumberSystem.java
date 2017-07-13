package hunter;
import java.util.*;
public class NumberSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n and m number");
		int n=s.nextInt();
		int m=s.nextInt();
		int num=0;
		int num1=0;
		int count=0;
		int r;
		int sum1=0;
		for(int j=0;j<m;j++){
			sum1=(sum1*10)+m;
		}
		System.out.println(sum1);
		for(int i=n;i<sum1+1;i++){
			count=0;
			num=0;
			num1=0;
			num=i;
			num1=i;
			String str=Integer.toString(i);
			int len=str.length();
			while(num!=0){
				r=num%10;
				if((r==n)||(r==m)){
					count=count+1;
				}
				num=num/10;
			}
			if(count==len){
				System.out.println(num1);
			}
			
		}

	}

}
