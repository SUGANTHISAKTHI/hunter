package hunter;
import java.util.*;
public class Analize {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enetr the string");
	String str1=s.nextLine();
	String removeSpace="";
	String LongestString="";
	int Maximum=0;
	for(int i=0;i<str1.length();i++){
		char ch=str1.charAt(i);
		int num=Character.getNumericValue(str1.charAt(i));
		//System.out.println(num);
		if(num!=(-1)){
			removeSpace=removeSpace+ch;
		
		}
	}
	String LongestString1="";
	for(int i=0;i<str1.length();i++){
		char ch1=str1.charAt(i);
		int num=Character.getNumericValue(str1.charAt(i));
		if(num==(-1)){
			LongestString="";
		}
		if(num!=(-1)){
			LongestString=LongestString+ch1;
		}
		int length=LongestString.length();
		if(Maximum<length){
			Maximum=length;
			LongestString1=LongestString;
		}
	}
	int counte=0;
	for(int i=0;i<str1.length();i++){
		char ch2=str1.charAt(i);
		if(ch2=='e'){
			counte=counte+1;
		}
	}
	int countInteger=0;
	for(int i=0;i<str1.length()-1;i++){
		char ch3=str1.charAt(i);
		if(ch3>='0'&&ch3<='9'&&str1.charAt(i+1)!='.'){
			countInteger=countInteger+1;
		}
	}
	int countdouble=0;
	int flag=0;
	for(int i=0;i<str1.length()-1;i++){
		flag=0;
		String strcheck=str1.substring(i,i+1);
		for(int j=0;j<strcheck.length();j++){
			char dot=strcheck.charAt(j);
			if((dot=='.')&&(str1.charAt(i+1)>=0&&str1.charAt(i+1)<=9)){
				flag=flag+1;
			}
		}
		if(flag>=1){
			countdouble=countdouble+1;
		}
	}
	String numberWords[]=str1.split(" ");
	int countWords=numberWords.length;
	String sentence[]=str1.split("\\.");
	int countsentence=sentence.length;
	/*for(int i=0;i<sentence.length;i++){
		System.out.println(sentence[i]);
	}*/
	System.out.println("1.removing space "+removeSpace);
	System.out.println("2.LongestString is "+LongestString1);
	System.out.println("3.The counting of e character is "+counte);
	System.out.println("4.the integer count value is "+countInteger);
	System.out.println("5.The double count value is "+countdouble);
	System.out.println("The count worlds "+countWords);
	System.out.println("The sentence count is "+countsentence);
	}

}
