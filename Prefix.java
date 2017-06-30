package guvi;
import java.util.Scanner;
public class Prefix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int count=0;
		int n1;
		int n2=n+1;
		System.out.println("Enter the arrays value ");
		String[] str=new String[n2];
		
		for(int i=0;i<n2;i++){
			str[i]=s.nextLine();
		}
		for(int i=0;i<n2;i++){
			n1=str[i].length();
			//System.out.println(n1);
			if(n1>2){
				if((str[i].charAt(0)=='0'&&str[i].charAt(1)=='1')||(str[i].charAt(0)=='1'&&str[i].charAt(1)=='0')){
			count=count+1;

				}
		}
		
	}
		System.out.println("The count is"+count);
	}

}
