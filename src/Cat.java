public class Cat extends Pet{
    private float whiskersLength;

    public Cat(String name, int age, String colour, String species, String breed, float whiskersLength) {
        super(name, age, colour, species, breed);
        this.whiskersLength = whiskersLength;
    }
}
