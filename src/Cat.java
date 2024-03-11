public class Cat extends Animal
{
    private boolean hasPlayedWith;
    private boolean hasScratchedPost;

    public Cat(String name, int age, boolean vaccinated, String eyeColor, boolean adopted, boolean fed, boolean petted, boolean hasPlayedWith, boolean hasScratchedPost)
    {
        super(name, age, vaccinated, eyeColor, adopted, fed, petted);
        this.hasPlayedWith = hasPlayedWith;
        this.hasScratchedPost = hasScratchedPost;
    }

    public void play()
    {
        hasPlayedWith = true;
        System.out.println(getName() + " has been played with.");
    }

    public void scratchPost()
    {
        hasScratchedPost = true;
        System.out.println(getName() + " has scratched post.");
    }

    public boolean isHasPlayedWith()
    {
        return hasPlayedWith;
    }

    public boolean isHasScratchedPost()
    {
        return hasScratchedPost;
    }
}