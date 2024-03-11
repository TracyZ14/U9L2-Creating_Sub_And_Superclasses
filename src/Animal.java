public class Animal
{
    private String name;
    private int age;
    private boolean vaccinated;
    private String eyeColor;
    private boolean adopted;
    private boolean fed;
    private boolean petted;

    public Animal(String name, int age, boolean vaccinated, String eyeColor, boolean adopted, boolean fed, boolean petted)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.eyeColor = eyeColor;
        this.adopted = adopted;
        this.fed = fed;
        this.petted = petted;
    }

    public void adopt()
    {
        adopted = true;
        System.out.println(name + " have been adopted.");
    }

    public void feed()
    {
        fed = true;
        System.out.println(name + " have been fed, thank you.");
    }

    public void pet()
    {
        petted = true;
        System.out.println(name + " have been petted.");
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isVaccinated()
    {
        return vaccinated;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }

    public boolean isAdopted()
    {
        return adopted;
    }

    public boolean isFed()
    {
        return fed;
    }

    public boolean isPetted()
    {
        return petted;
    }
}