public class Store
{
    private String name;
    private String address;

    public Store(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public void visit()
    {
        System.out.println("You visited the store " + name + " located at " + address + ".");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
}