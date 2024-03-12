public class Main
{
    public static void main(String[] args)
    {
        Animal unknown = new Animal("Unknown", 1, false, "Red");
        System.out.println("Name: " + unknown.getName());
        System.out.println("Age: " + unknown.getAge());
        System.out.println("Vaccinated: " + unknown.isVaccinated());
        System.out.println("Eye color: " + unknown.getEyeColor());
        System.out.println("Adopted: " + unknown.isAdopted());
        System.out.println("Fed: " + unknown.isFed());
        System.out.println("Petted: " + unknown.isPetted());
        unknown.adopt();
        unknown.feed();
        unknown.pet();
        System.out.println("Adopted: " + unknown.isAdopted());
        System.out.println("Fed: " + unknown.isFed());
        System.out.println("Petted: " + unknown.isPetted());

        System.out.println();

        Dog myDog = new Dog("Puppy", 2, true, "Black");
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Vaccinated: " + myDog.isVaccinated());
        System.out.println("Eye color: " + myDog.getEyeColor());
        System.out.println("Adopted: " + myDog.isAdopted());
        System.out.println("Fed: " + myDog.isFed());
        System.out.println("Petted: " + myDog.isPetted());
        System.out.println("Has been walked: " + myDog.hasBeenWalked());
        System.out.println("Has played fetch: " + myDog.hasPlayedFetch());
        myDog.adopt();
        myDog.feed();
        myDog.pet();
        myDog.walk();
        myDog.playFetch();
        System.out.println("Adopted: " + myDog.isAdopted());
        System.out.println("Fed: " + myDog.isFed());
        System.out.println("Petted: " + myDog.isPetted());
        System.out.println("Has been walked: " + myDog.hasBeenWalked());
        System.out.println("Has played fetch: " + myDog.hasPlayedFetch());

        System.out.println();

        Cat myCat = new Cat("Kitty", 3, true, "Yellow");
        System.out.println("Name: " + myCat.getName());
        System.out.println("Age: " + myCat.getAge());
        System.out.println("Vaccinated: " + myCat.isVaccinated());
        System.out.println("Eye color: " + myCat.getEyeColor());
        System.out.println("Adopted: " + myCat.isAdopted());
        System.out.println("Fed: " + myCat.isFed());
        System.out.println("Petted: " + myCat.isPetted());
        System.out.println("Has played with: " + myCat.hasPlayedWith());
        System.out.println("Has scratched post: " + myCat.hasScratchedPost());
        myCat.adopt();
        myCat.feed();
        myCat.pet();
        myCat.play();
        myCat.scratchPost();
        System.out.println("Adopted: " + myCat.isAdopted());
        System.out.println("Fed: " + myCat.isFed());
        System.out.println("Petted: " + myCat.isPetted());
        System.out.println("Has played with: " + myCat.hasPlayedWith());
        System.out.println("Has scratched post: " + myCat.hasScratchedPost());
    }
}