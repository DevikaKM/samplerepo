package inheritance;

public class SingleChild extends SingleParent
{
public void display(String S)
{
	System.out.println(S);
}
	public static void main(String[] args) 
	{
		SingleChild obj = new SingleChild();
		obj.print();
		obj.display("Inheritance");
	}

}
