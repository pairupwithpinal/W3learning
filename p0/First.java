package p0;

public class First {
    protected int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static void main(String[] inputs) {
        System.out.println("I am learning Java " + inputs[0] + inputs[1]);

        First f1 = new First();
        System.out.println("value of z:"+f1.getZ());
        f1.setZ(15);
        System.out.println("value of z:"+f1.getZ());


        First f2 = new First();
        System.out.println("value of z:"+f2.getZ());
        f2.setZ(150);
        System.out.println("value of z:"+f2.getZ());

        System.out.println(".."+f1.hashCode());
        System.out.println(".."+f2.hashCode());

    }
}



