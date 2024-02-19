package feature.encapsulation.p2;

import feature.encapsulation.p1.Animal;

public class ChildZoo extends Animal {
    public static void main(String[] args) {
        // protected members are visible from subclass along with public which is always visible
        ChildZoo c1 = new ChildZoo();
        c1.protected_sound();
        c1.public_sound();
    }
}
