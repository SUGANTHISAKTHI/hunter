package hunter;
import java.util.Scanner;
public class Substring2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1");
		String str1=s.next();
		System.out.println("Enter the string2");
		String str2=s.next();
		int n1=str1.length();
		int n2=str2.length();
		int i,j,index=0;
		if(str1.contains(str2)){
			for(i=0;i<n1;i++){
				if(str1.charAt(i)==str2.charAt(0)){
					index=i;
				}
				
			}
			System.out.println(index);
		}
		if(!str1.contains(str2)){
			System.out.println("-1");
		}
	
		
	}

}
