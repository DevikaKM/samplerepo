package aggregation;

public class aggregation2

{
	String city;
	String state;
	aggregation1 ref;
	public aggregation2(String city,String state,aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void StudentDisplay()
	{
		System.out.println(ref.name+","+ref.roll_no+","+ref.address);
		System.out.println(city+","+state);
	}
	public static void main(String[] args)
	{
		aggregation1 obj1=new aggregation1("Devika",123,"Address");
		
		aggregation2 obj2= new aggregation2("Trivandrum","Kerala",obj1);
		obj2.StudentDisplay();
		
	}
}
