package abstraction;

public class AbstractionChild extends AbstractionParent 
{

	public static void main(String[] args)
	{
		AbstractionChild obj = new AbstractionChild();
		obj.sum();
		obj.display();
		obj.print();

	}

	@Override
	void display() 
	{
		 System.out.println(" abstract method 1");
		
	}

	@Override
	void print() 
	{		 
		System.out.println(" abstract method 2");		
	}

}
