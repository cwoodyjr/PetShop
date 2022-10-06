public class Main {
    public static void main(String[] args) {
//        Pet p1 = new Pet("fido",3,"blue","dog","staffy");
//        Pet p2 = new Pet();

        Dog d1 = new Dog("scoobie",6,"pink","dog","great dane");

        Snake s1 = new Snake("hissy",6, "grey","snaley","hognose",true,false,2.3f );
        Cat c1 = new Cat("fluffy", 4, "ginger", "cat", "ugly",2.3f);
//        System.out.println(p1.getColour());
//        System.out.println(p1.getAge());
//        p1.setAge(9);
//        System.out.println(p1.getAge());
        System.out.println(d1.getAge());
        d1.getOlder();
        System.out.println(d1.getAge());
        System.out.println(c1.getName()+" is a "+c1.getColour()+" cat who is a twat");
        s1.sleep();
        d1.sleep();
    }
}
