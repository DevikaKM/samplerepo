package inheritance;

public class MultiLevelChild extends MultiLevelParent
{
	public void display()
	{
		System.out.println("Am the child class");
	}

	public static void main(String[] args)
{
		MultiLevelChild	obj = new MultiLevelChild();
		obj.Show();
		obj.Print();
		obj.display();

	}

}
