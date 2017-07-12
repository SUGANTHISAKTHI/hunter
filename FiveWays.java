package hunter;
import java.util.*;
public class FiveWays {
public static void display(String str){
	int number=Integer.parseInt(str);
	int len=str.length();
	String str1=" ";
	char ch1=' ';
	int num;
	int num1;
	for(int i=0;i<len;i++){
		ch1=' ';
		num=0;
		num1=0;
		ch1=str.charAt(i);
		num=Character.getNumericValue(ch1);
		for(int j=(char)97;j<=122;j++){
			char ch2=(char)j;
			if(ch2>='a' && ch2<= 'z'){
				num1=(int)ch2-'a'+1;
			}
			if(num==num1){
				str1=str1+ch2;
			}
		}
	}System.out.println(str1);
	int number4=number%10;
	int number1=number/10;
	int number2=number1%10;
	int number3=number4+number2;
	String str2=" ";
	char onech=' ';
	int num3=0;
	for(int i=0;i<len-1;i++){
		str2=str2+str1.charAt(i);
	}
	if(number3<=26){
		for(int i=(char)97;i<=122;i++){
			char ch4=(char)i;
			if(ch4>'a' && ch4<='z'){
				num3=(int)ch4-'a'+1;
			}
			if(number3==num3){
				onech=ch4;
			}
		}
	}
	str2=str2+onech;
	System.out.println(str2);
	String str3=" ";
	int number11=number1%10;
	number1=number1/10;
	int number22=number1%10;
	int number33=number11+number22;
	for(int i=0;i<len-2;i++){
		str3=str3+str1.charAt(i);
	}
	if(number33<=26){
		for(int i=(char)97;i<=122;i++){
			char ch4=(char)i;
			if(ch4>'a' && ch4<='z'){
				num3=(int)ch4-'a'+1;
			}
			if(number33==num3){
				onech=ch4;
			}
		}
	}
	int len2=str2.length();
	str3=str3+onech+str2.charAt(len2-1);
	System.out.println(str3);
	String str4=" ";
	int number111=number1%10;
	number1=number1/10;
	int number222=number1%10;
	int number333=number111+number222;
	for(int i=0;i<len-2;i++){
		str3=str3+str1.charAt(i);
	}
	if(number333<=26){
		for(int i=(char)97;i<=122;i++){
			char ch4=(char)i;
			if(ch4>'a' && ch4<='z'){
				num3=(int)ch4-'a'+1;
			}
			if(number333==num3){
				onech=ch4;
			}
		}
	}
	for(int i=0;i<len-4;i++){
		str4=str4+str1.charAt(i);
	}
	str4=str4+onech;
	for(int i=4;i<str3.length()-3;i++){
		str4=str4+str3.charAt(i);
	}
	System.out.println(str4);
	
}
	public static void main(String[] args) {
		FiveWays f=new FiveWays();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=Integer.toString(n);
		f.display(str);
	}

}
