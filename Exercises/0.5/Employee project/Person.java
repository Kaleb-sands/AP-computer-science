public class Person
{
	private String name;

	public Person()  {
		name = "Person Constructor: No name yet.";
	}
	public Person(String n)   {
		name = n;
	}
	public void setName(String newName)  {
		name = newName;
	}
	public String getName()  {
		return name;
	}
	public void message()   {
                       System.out.println("Person Class - Name: “ + name);
           }
}
