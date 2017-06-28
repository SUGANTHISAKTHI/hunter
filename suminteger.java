package guvi;
import java.util.Scanner;
public class suminteger {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		int r,sum;
		int sum1=0;
		String str=String.valueOf(n);
		int m=str.length();
		for(i=0;i<m-1;i++){
			//int n1=i;
			char ch=str.charAt(i);
			char ch1=str.charAt(i+1);
			int p=Character.getNumericValue(ch);
			int q=Character.getNumericValue(ch1);
			//System.out.println(p+" "+q);
			sum=1;
			for(j=0;j<q;j++){
				sum=sum*p;
			}
			sum1=sum1+sum;
			
		}
		System.out.println(sum1+1);
		
		
		}

	}
