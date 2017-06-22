package Guvi;
import java.util.Scanner;
public class days {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		String str=s.nextLine();
		if(str.equals("sunday")){
			System.out.println("false");
		}else{
			System.out.println("true");
		}

	}

}
