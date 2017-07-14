package hunter;
import java.util.*;
public class Stringcount {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	System.out.println("Enter the string");
	String[] a=new String[n];
	for(int i=0;i<n;i++){
		a[i]=s.next();
	}
int len=0;
for(int i=0;i<n;i++){
	len=0;
	len=a[i].length();
	if(len==1){
		System.out.println(a[i]);
		break;
	}
}
	}

}
