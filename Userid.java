package hunter;
import java.util.*;
public class Userid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
	     String str2=s.next();
	     int len1=str1.length();
	     int len2=str2.length();
	     String smaller=" ";
	     String higher=" ";
	     String userid=" ";
	     if(len1>len2){
	    	 smaller=str2;
	    	 higher=str1;
	     }else if(len1<len2){
	    	 smaller=str1;
	    	 higher=str2;
	     }else if(len1==len2){
	    	 String[] a=new String[2];
	    	 a[0]=str1;
	    	 a[1]=str2;
	    	 Arrays.sort(a);
	    	 higher=a[0];
	    	 smaller=a[1];
	    	  }
	     System.out.println("Enter the pint number");
	     int pin=s.nextInt();
	     System.out.println("Enter the number");
	     int num1=s.nextInt();
	     int num2=0;
	     int num3=0;
	     String str3=Integer.toString(pin);
	     int len3=str3.length();
	     for(int i=0;i<len3;i++){
	    	 if((num1-1)==i){
	    		 num2=Integer.parseInt(str3.substring(i,i+1));
	    		 
	    	 }
	     }
	     System.out.println(num2);
	     int j=0;
	     for(int i=len3-1;i>=0;i--){
	    	 j=j+1;
	    	 if((num1)==j){
	    		 num3=Character.getNumericValue(str3.charAt(i));
	    	 }
	     }
	     System.out.println(num3);
	     userid=userid+higher.charAt(0)+smaller+num2+num3;
	     System.out.println(userid);
	}

}
