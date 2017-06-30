package guvi;
import java.util.Scanner;
public class Maxindex {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the array size");
		 int n=s.nextInt();
		 System.out.println("Enter the array value");
		 int i,j,maxindex=0;
		 int sub=0,max=0;
		 int[] a=new int[n];
		 int sub1=0;
		 for(i=0;i<n;i++){
			 a[i]=s.nextInt();
		 }
		 for(i=0;i<n-1;i++){
			 sub=a[i]-a[i+1];
			sub1=Math.abs(sub);
			//System.out.println(sub1);
			 if(max<sub1){
				 max=sub1;
				// System.out.println(max);
				 maxindex=i;
			 }

		 }
		 System.out.println(maxindex);
	}

}
