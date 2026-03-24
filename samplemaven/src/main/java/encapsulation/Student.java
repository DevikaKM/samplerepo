package encapsulation;

public class Student 
{
 private String name;
 private int rollNo;
 
 public void getter()
 {
	System.out.println(name+" "+rollNo); 
 }
 public void setter(String name,int rollNo)
 {
	this.name=name;
	this.rollNo=rollNo;
 }
}
