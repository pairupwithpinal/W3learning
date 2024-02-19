package feature.encapsulation.p2;

import feature.encapsulation.p1.Animal;

public class OutsideZoo
{
    public static void main(String[] args) {
        // from different package class only public members are visible
        Animal a1 = new Animal();
        a1.public_sound();
    }
}
