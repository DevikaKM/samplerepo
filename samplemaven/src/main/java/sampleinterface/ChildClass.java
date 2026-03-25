package sampleinterface;

public class ChildClass implements ParentInterface
{

	public void sum(int i, int j) 
	{
		int sum =i+j;
		System.out.println(sum);
	}

	public static void main(String[] args) {
	/*
		ChildClass obj = new ChildClass();
		obj.display();
		obj.print();
		obj.sum(5,6);

	*/
	
	//reference creation-
	
	ParentInterface ref = new ChildClass();
	ref.display();
	ref.print();
	}
	


	@Override
	public void display() {
		System.out.println("Interface method 1");
		
	}

	@Override
	public void print() {
		System.out.println("Interface method 2");
		
	}

}
