public class Test {

    public static void main(String[] args) {

    Student st = Student.createObject("aarya");
        System.out.println("Name of SD:"+st.SDN);

        st.printName();
    }
}

class Student {


    public static String SDN = "GVSD";
    private String name;
    private Student(String name) {
        this.name = name;
    }

    public void printName()
    {
        System.out.println("name:"+name);
    }

    public static Student createObject(String name)
    {
        return new Student(name);
    }
}
