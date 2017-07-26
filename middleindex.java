package hunter;
import java.util.*;
public class middleindex {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	System.out.println("Enter the array value");
	int[] array=new int[size];
	int sumfirst=0,sumlast=0;
	int sizefirst=2,sizelast=size-3;
	int sizezero=1;
	for(int i=0;i<size;i++){
		array[i]=s.nextInt();
	}
	for(int i=0;i<size;i++){
		sumfirst=0;
		sumlast=0;
		for(int j=0;j<i+1;j++){
            sumfirst=sumfirst+array[j];			
		}
		for(int k=i+2;k<size;k++){
			sumlast=sumlast+array[k];
	}
		if(sumfirst==sumlast){
			System.out.println(sumfirst+" "+sumlast+" "+i);
			System.out.println("The middel index position is  "+(i+1)+" and the array value "+array[i+1]);
			break;
		}
		
	}

}
}
