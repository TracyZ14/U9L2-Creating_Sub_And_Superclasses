public class ClothingStore extends Store
{
    private String clothing;

    public ClothingStore(String name, String address, String clothing)
    {
        super(name, address);
        this.clothing = clothing;
    }

    public void buyClothes()
    {
        System.out.println("You bought " + clothing + " from the store " + super.getName() + " located at " + super.getAddress() + ".");
    }

    public String getClothing()
    {
        return clothing;
    }

    public void setClothing(String newClothing)
    {
        clothing = newClothing;
    }
}