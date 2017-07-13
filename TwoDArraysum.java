package hunter;
import java.util.*;
public class TwoDArraysum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] a=new int[n][m];
		int sum=0;
		int p=0;
		System.out.println("Enter the emenets");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n-1;i++){
			for(int j=1;j<2;j++){
				if(a[i][j]>a[i+1][j-1]){
					p=a[i][j];
					sum=sum+a[i][j];
				}else{
					if(a[i+1][j-1]>a[i][j]){
						p=a[i+1][j-1];
						sum=sum+a[i+1][j-1];
					}
				}
			}
		}
		int sum1=0;
		for(int i=n-1;i<n;i++){
			for(int j=0;j<m;j++){
				if(p==a[i][j]){
					for(int k=j;k<m;k++){
						sum1=sum1+a[i][k];
					}
				}
			}
		}
		System.out.println(sum);
		int output=sum+sum1+a[0][0];
		System.out.println(output);

	}

}
