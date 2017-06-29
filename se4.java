package scenior;
import java.util.Scanner;
public class se4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String str=Integer.toString(num);
		int num1=num,sl;
		int sum=0,sum1=0,sum2=0,r;
		int r1,sum3=0,j,i,k;
		int l=str.length();
		int o=1;
		int f=Character.getNumericValue(str.charAt(0));
		int l1=Character.getNumericValue(str.charAt(l-1));
		for(j=0;j<f;j++){
			o=(o*l1);
		}
		//System.out.println(o);
	     for(i=0;i<str.length()-1;i++){
	    	 k=1;
	    	int m=Character.getNumericValue(str.charAt(i+1));
	    	 for(j=0;j<m;j++){
	    		int n=Character.getNumericValue(str.charAt(i));
	    		 //System.out.println(n);
	    		 k=(k*n);
	    		 //System.out.println(k);
	    		 }
	    	 sum=sum+k;
	     }
	     System.out.println(sum+o);
	}
}
