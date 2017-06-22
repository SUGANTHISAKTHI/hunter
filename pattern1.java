package Guvi;
import java.util.Scanner;
public class pattern1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=s.nextInt();
	int i,j,k,l;
	for(i=0;i<n;i++){
		for(j=0;j<n-i;j++){
			System.out.print("*");
		}
		for(k=0;k<=0;k++){
			System.out.print(" ");
		}for(l=0;l<n-i;l++){
			System.out.print("*");
		}
		System.out.print("\n");
	}
	}

}
