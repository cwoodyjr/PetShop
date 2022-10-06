public abstract class Pet {
    private String name;
    private int age;
    private String colour;
    private String species;
    private String breed;

    public Pet(String name, int age, String colour, String species, String breed) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.species = species;
        this.breed = breed;
    }
    public Pet(){
        name = "no name";
        age = 0;
        colour = "black";
        species = "small";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void getOlder(){
        age++;
    }
    public void eat(){
        System.out.println("Nom Nom!!");
    }
    public void sleep(){
        System.out.println("ZZZZZZZ");
    }
}
