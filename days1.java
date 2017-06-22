package Guvi;
import java.util.Scanner;
public class days1 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		String str=s.nextLine();
		if(str.equals("sunday")){
			System.out.println(str+"=false");
		}else{
			System.out.println(str+"=true");
		}

	}

}
