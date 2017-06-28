package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class odd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String[] str=str1.split(" ");
		int n=str.length;
		int i;
		String str3=" ";
		String str5="";
		StringBuffer str6=new StringBuffer(str[0]);
		str6.reverse();
		String str7=str6.toString();
		str5=str5+str7;
		for(i=1;i<n;i++){
	       if(i%2==0){
	    	  // System.out.println(str[i]);
        StringBuffer str2=new StringBuffer(str[i]);
			str2.reverse();
			 str3=str2.toString();
			 }
	       if(i%2!=0){
	    	   str3=str[i];
	       }
	
			str5=str5+" "+str3;
			
			
		}
		System.out.println(str5);
		
		
		
		
	}

}
