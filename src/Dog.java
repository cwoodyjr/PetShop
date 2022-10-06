public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String colour, String species, String breed) {
        super(name, age, colour, species, breed);
        this.breed = breed;
    }
}
