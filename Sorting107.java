package hunter;
import java.util.*;
public class Sorting107 {
public static void main(String[] args) {
	Scanner  s=new Scanner(System.in);
	String string1=s.nextLine();
	if(string1.length()>=200){
	String string=string1.toLowerCase();
	String str[]=string.split(" ");
	Arrays.sort(str);
	for(int i=0;i<str.length;i++){
		System.out.println(str[i]);
	}
	
	}else{
		System.out.println("Please enter the more then 200 charArcter");
	}
	}

}
