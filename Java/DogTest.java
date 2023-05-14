// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class DogTest
{
    public static void main(String[] args)
    {
	//Dog1 dog = new Dog1("Spike");
	//System.out.println(dog.getName() + " says " + dog.speak());
	Labrador dog2 = new Labrador("Robin", "Yellow");
	System.out.println(dog2.getName() + " says " + dog2.speak());
	System.out.println(dog2.avgBreedWeight());
	Yorkshire dog3 = new Yorkshire("Linzy");
	System.out.println(dog3.getName() + " says " + dog3.speak());
        System.out.println(dog3.avgBreedWeight());
    }
}
