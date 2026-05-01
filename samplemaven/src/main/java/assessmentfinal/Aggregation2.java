package assessmentfinal;

public class Aggregation2 
{
	String City,State;
	Aggregation1 ref;
	
	public Aggregation2(String City,String State,Aggregation1 ref)
	{
		this.City=City;
		this.State=State;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno+" "+ref.address+" "+City+" "+State);
	}

	public static void main(String[] args) 
	{
		Aggregation1 obj1 = new Aggregation1("Devika",23,"XYZ");
		Aggregation2 obj2 = new Aggregation2("Trivandrum","Kerala",obj1);
		obj2.display();		
	}

}
