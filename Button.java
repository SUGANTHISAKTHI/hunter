package hunter;
import java.util.Scanner;
public class Button {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i;
		int len=str.length();
		for(i=0;i<len;i++){
			char ch=str.charAt(i);
		switch (ch){
			case   '2':
				System.out.println("ABC");
				break;
			case   '3':
				System.out.println("DEF");
				break;
			case   '4':
				System.out.println("IJK");
				break;
			case   '5':
				System.out.println("LMN");
				break;
			case  '6':
				System.out.println("OPQ");
				break;
			case   '7':
				System.out.println("RST");
				break;
			case   '8':
				System.out.println("UVW");
				break;
			case   '9':
				System.out.println("XYZ");
				break;
		     default:
					System.out.println("INVALID NUMBER");
					break;
			}
		
		}

	}

}
