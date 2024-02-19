package feature.encapsulation.p1;

public class InsideZoo {
    public static void main(String[] args) {
        // private members (static or instance level both) not visible from different class
        Animal a1 = new Animal();
        // a1.pricate_sound(); not visible
        // Animal.PRIVATE_ALIVE not visible

        System.out.println(Animal.DEFAULT_ALIVE);

        a1.default_sound();
        a1.protected_sound();
        a1.public_sound();
    }
}
