public class Snake extends Pet {
    private boolean Scales = true;
    private boolean isVenomous;
    private float length;

    public Snake(String name, int age, String colour, String species, String breed, boolean scales, boolean isVenomous, float length) {
        super(name, age, colour, species, breed);
        Scales = scales;
        this.isVenomous = isVenomous;
        this.length = length;

    }
    public void sleep(){
        System.out.println("sssssss");
    }
}
