
public class otherThing
{
    public String firstName;
    public String middleName;
    public String lastName;
    public int age;
    public otherThing(String firstName, String middleName, String lastName, int age)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    public otherThing()
    {
        this.firstName = null;
        this.middleName = null;
        this.lastName = null;
        this.age = -1;
    }

    
    public String toString() { 
        return firstName + " " + middleName + " " + lastName;
    }
}
