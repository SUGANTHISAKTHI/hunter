package Guvi;

import java.util.Scanner;

public class Array {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j,count=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
			}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i!=j){
			
				if(a[i]!=a[j]){
					count=1;
				}else{
					count=0;
					break;
				}
			}
			}
			
	if(count==1){
				System.out.println(a[i]);
	}			
			}	
	}
	}

