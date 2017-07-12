package hunter;
import java.util.*;
class student{
	String name;
	int mark1;
	int mark2;
	int mark3;
	int total;
	student(String name,int mark1,int mark2,int mark3){
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.total=mark1+mark2+mark3+total;
	}
}
public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList<student> list=new ArrayList<student>();
	student std1=new student("sugan",99,100,100);
	student std2=new student("suganthi",100,99,90);
	student std3=new student("sakthi",100,100,100);
	student std4=new student("suyampu",77,98,74);
	list.add(std1);
	list.add(std2);
	list.add(std3);
	list.add(std4);
int max=0;
Iterator i=list.iterator();
Iterator i1=list.iterator();
while(i.hasNext()){
	student s=(student)i.next();
	if(max<s.total){
		max=s.total;
	}
	System.out.println(s.total+" "+s.name+" ");
}
while(i1.hasNext()){
	student s1=(student)i1.next();
	if(max==s1.total){
		System.out.println(s1.name);
	}
}
	
	
	}

}
