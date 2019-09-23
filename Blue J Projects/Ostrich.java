
public class Ostrich
{
    private String country;
    private double height;
    public Ostrich()
    {
        country = null;
        height = 0.0;
    }
    public Ostrich(String country, double height)
    {
        this.country = country;
        this.height = height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    //getter methods
    public String getCountry()
    {
      return this.country;  
    }
    public double getHeight()
    {
        return this.height;
    }
     public String toString(){
        return "Country: " + this.country + " Height: " + this.height + " feet";
    }
}
