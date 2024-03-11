public class Dog extends Animal
{
    private boolean hasBeenWalked;
    private boolean hasPlayedFetch;

    public Dog(String name, int age, boolean vaccinated, String eyeColor, boolean adopted, boolean fed, boolean petted, boolean hasBeenWalked, boolean hasPlayedFetch)
    {
        super(name, age, vaccinated, eyeColor, adopted, fed, petted);
        this.hasBeenWalked = hasBeenWalked;
        this.hasPlayedFetch = hasPlayedFetch;
    }

    public void walk()
    {
        hasBeenWalked = true;
        System.out.println(getName() + " has been walked.");
    }

    public void playFetch()
    {
        hasPlayedFetch = true;
        System.out.println(getName() + " has played fetch.");
    }

    public boolean isHasBeenWalked()
    {
        return hasBeenWalked;
    }

    public boolean isHasPlayedFetch()
    {
        return hasPlayedFetch;
    }
}