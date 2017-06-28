package guvi;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		//String strlow=str1.toLowerCase();
		String[] str2=str1.split(" ");
		int n=str2.length;
		int i;
		String check=str2[0];
		String checkstr=check.toLowerCase();
		StringBuffer str3=new StringBuffer(checkstr);
		str3.reverse();
		String str4=str3.toString();
		String str5="";
		String str6=" ";
		String str55=" ";
		for(i=0;i<check.length();i++){
			char ch1=check.charAt(i);
			if(Character.isUpperCase(ch1)){
				str5=str5+Character.toUpperCase(str4.charAt(i));
			}
			if(!Character.isUpperCase(ch1)){
				str5=str5+str4.charAt(i);
			}
		}
			System.out.println(str5);
		
		for(int j=1;j<n;j++){
			str55=" ";
			String check1=str2[j];
			String checkstr1=check1.toLowerCase();
			StringBuffer str33=new StringBuffer(checkstr1);
			str33.reverse();
			String str44=str33.toString();
		for(i=0;i<check1.length();i++){
			char ch2=check1.charAt(i);
			if(Character.isUpperCase(ch2)){
				str55=str55+Character.toUpperCase(str44.charAt(i));
			}
			if(!Character.isUpperCase(ch2)){
				str55=str55+str44.charAt(i);
			}
		}
		
		str5=str5+" "+str55;
		}
		
		System.out.println(str5);
		
	}

}
