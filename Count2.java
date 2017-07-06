package hunter;
import java.util.Scanner;
public class Count2 {

	public static void main(String[] args) {
		Count2 c=new Count2();
		System.out.println(c.Count());
}
	int Count(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int count=0;
		for(i=0;i<n;i++){
			if(a[i]==2){
				count=count+1;
			}
		}
		return count;
	}

}
