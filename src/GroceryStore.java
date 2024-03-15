public class GroceryStore extends Store
{
    private String grocery;

    public GroceryStore(String name, String address, String grocery)
    {
        super(name, address);
        this.grocery = grocery;
    }

    public void buyGroceries()
    {
        System.out.println("You bought " + grocery + " from the store " + super.getName() + " located at " + super.getAddress() + ".");
    }

    public String getGrocery()
    {
        return grocery;
    }

    public void setGrocery(String newGrocery)
    {
        grocery = newGrocery;
    }
}