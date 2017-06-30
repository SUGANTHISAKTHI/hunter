package guvi;
import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r100=0,r500=0,r50=0,r10=0,r1=0;
		r500=n/500;
		int n1=n%500;
		r100=n1/100;
		int n2=n1%100;
		r50=n2/50;
		int n3=n2%50;
		r10=n3/10;
		int n4=n3%10;
		r1=n4/1;
		int count=r500+r100+r50+r10+r1;
		System.out.println(count);
	}

}
