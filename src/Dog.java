public class Dog extends Animal
{
    private boolean beenWalked;
    private boolean playedFetch;

    public Dog(String name, int age, boolean vaccinated, String eyeColor)
    {
        super(name, age, vaccinated, eyeColor);
        this.beenWalked = false;
        this.playedFetch = false;
    }

    public void walk()
    {
        beenWalked = true;
        System.out.println(getName() + " has been walked.");
    }

    public void playFetch()
    {
        playedFetch = true;
        System.out.println(getName() + " has played fetch.");
    }

    public boolean hasBeenWalked()
    {
        return beenWalked;
    }

    public boolean hasPlayedFetch()
    {
        return playedFetch;
    }
}