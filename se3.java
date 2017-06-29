package scenior;
import java.util.Scanner;
public class se3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		int r,sum=0;
		int i,j,k=1;
		int num=Integer.parseInt(str);
		while(num!=0){
			j=1;
			r=num%10;
			for(i=0;i<n;i++){
				j=(j*r);
				
			}
			sum=sum+j;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
