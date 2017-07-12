package hunter;
import java.util.*;
public class palindromecheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		String str1="";
		String str2="";
		String str4="";
		String str6=" ";
		int length;
		int max=0;
		String str5="";
		int len=str.length();
		char ch1=' ';
		char ch2=' ';
		char ch3=' ';
		for(int i=0;i<len;i++){
			str2="";
			str1="";
			str4="";
			str5="";
			length=0;
			ch1=str.charAt(i);
			str1=str1+ch1;
			for(int j=i+1;j<len;j++){
				ch3=' ';
				ch2=str.charAt(j);
				if(ch1!=ch2){
					str1=str1+ch2;
				}
				if(ch1==ch2){
					str1=str1+ch2;
					break;
				}
				
			}
			str2=str1;
			StringBuffer str3=new StringBuffer(str1);
			str4=str3.reverse().toString();
			//System.out.println(str2);
			//System.out.println(str4);
		  if(str2.equals(str4)){
			 // System.out.println(str4);
				length=str4.length();
				//System.out.println(length);
				if(max<length){
					max=length;
					str5=str4;
					str6=str5;
					//System.out.println(str5);
				}
			}
		}
		System.out.print(str6);
	}

}
