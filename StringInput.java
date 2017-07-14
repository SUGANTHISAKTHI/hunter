package hunter;
import java.util.*;
public class StringInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		int len=str.length();
		char ch1;
		char ch2,ch3;
		int num,num1;
		String str1=" ";
		int sum=0;
		for(int i=1;i<len-1;i++){
			ch1=' ';
			ch2=' ';
			ch3=' ';
			sum=0;
			num1=0;
			num=0;
			ch1=str.charAt(i);
			num=Character.getNumericValue(ch1);
			ch2=str.charAt(i-1);
			if(num>0 && ch2>='a'&& ch2<='z'){
				for(int j=0;j<num;j++){
					str1=str1+ch2;
				}
			}
		}
	    int number1=Character.getNumericValue(str.charAt(len-1));
		int number2=Character.getNumericValue(str.charAt(len-2));
		sum=(sum*10)+number2;
		sum=(sum*10)+number1;
		int number4=sum-number2;
		char ch4=str.charAt(len-3);
		for(int p=0;p<number4;p++){
			str1=str1+ch4;
		}
	
		System.out.println(number4);
		System.out.println(str1);
	}

}
