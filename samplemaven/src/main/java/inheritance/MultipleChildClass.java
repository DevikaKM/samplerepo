package inheritance;

public class MultipleChildClass implements MultipleIParent1, MultipleIParent2
{
	public void sum(int a, int b)
	{
		int sum =a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		MultipleChildClass obj = new MultipleChildClass();
		obj.display();
		obj.print();
		obj.sum(2, 6);
	}

	@Override
	public void print() {
		System.out.println("I method 1");
		
	}

	@Override
	public void display() {
		System.out.println("I method 2");
		
	}

}
