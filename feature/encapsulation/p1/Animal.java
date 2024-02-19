package feature.encapsulation.p1;

public class Animal {
    private String private_name;
    String default_name;
    protected  String protected_name;
    public String public_name;

    private void private_sound()
    {
        System.out.println("private sound");
    }

    void default_sound()
    {
        System.out.println("default sound");
    }

    protected void protected_sound()
    {
        System.out.println("protected sound");
    }

    public void public_sound()
    {
        System.out.println("public sound");
    }

    private static boolean PRIVATE_ALIVE = true;
    static boolean DEFAULT_ALIVE = true;
    protected static boolean PROTECTED_ALIVE = true;
    public static boolean PUBLIC_ALIVE = true;
    public static void main(String[] args) {
        // Lesson 1 : Only static members can be accessed from static method
        // From same class method's all kind of (access modifiers) static variables can be accessed
        System.out.println("Is Animal alive:"+PRIVATE_ALIVE);

        // Lesson 2: All access members can be accessed via object of class within same class's method
        Animal a1 = new Animal();
        a1.private_sound();
        a1.default_sound();
        a1.protected_sound();
        a1.public_sound();
    }
}
