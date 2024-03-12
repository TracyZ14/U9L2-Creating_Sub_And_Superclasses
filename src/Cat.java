public class Cat extends Animal
{
    private boolean playedWith;
    private boolean scratchedPost;

    public Cat(String name, int age, boolean vaccinated, String eyeColor)
    {
        super(name, age, vaccinated, eyeColor);
        this.playedWith = false;
        this.scratchedPost = false;
    }

    public void play()
    {
        playedWith = true;
        System.out.println(getName() + " has been played with.");
    }

    public void scratchPost()
    {
        scratchedPost = true;
        System.out.println(getName() + " has scratched post.");
    }

    public boolean hasPlayedWith()
    {
        return playedWith;
    }

    public boolean hasScratchedPost()
    {
        return scratchedPost;
    }
}