package hunter;
import java.util.*;
public class Pyramid {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 int number=s.nextInt();
 for(int i=0;i<number;i++){
	 for(int j=0;j<i+1;j++){
		 System.out.print("* ");
	 }
	 System.out.print(" ");
	 System.out.print("\n");
 }
	
	}

}
